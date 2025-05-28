package org.sid.ebankingbackend.services;

import jakarta.transaction.Transactional;
import org.sid.ebankingbackend.entities.BankAccount;
import org.sid.ebankingbackend.entities.CurrentAccount;
import org.sid.ebankingbackend.entities.SavingAccount;
import org.sid.ebankingbackend.repositories.BankAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BankService {
    @Autowired
    private BankAccountRepository bankAccountRepository;
    public void consuter(){
        BankAccount bankAccount=bankAccountRepository.findById("7ab5f2ac-3439-4b03-a694-d5f50be41cd6").orElse(null);
        if(bankAccount!=null) {
            System.out.println("------------------------------");
            System.out.println("Bank Account ID: " + bankAccount.getId());
            System.out.println("Balance" + bankAccount.getBalance());
            System.out.println("Status" + bankAccount.getStatus());
            System.out.println("CreatedAt" + bankAccount.getCreatedAt());
            System.out.println("Customer" + bankAccount.getCustomer().getName());
            System.out.println(bankAccount.getClass().getSimpleName());
            if (bankAccount instanceof CurrentAccount) {
                System.out.println("Overdraft" + ((CurrentAccount) bankAccount).getOverdraft());
            } else if (bankAccount instanceof SavingAccount) {
                System.out.println("Customer" + ((SavingAccount) bankAccount).getInterestRate());
            }
            bankAccount.getAccountOperations().forEach(accountOperation -> {
                System.out.println("=================================");
                System.out.println("Type: " + accountOperation.getType());
                System.out.println("Amount: " + accountOperation.getAmount());
                System.out.println("operationDate: " + accountOperation.getOperationDate());
            });
        }
    }
}
