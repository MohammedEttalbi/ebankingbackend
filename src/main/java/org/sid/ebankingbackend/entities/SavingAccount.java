package org.sid.ebankingbackend.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@DiscriminatorValue("SA")
public class SavingAccount extends BankAccount {
    private double interestRate; /* وَإِنْ تُبْتُمْ فَلَكُمْ رُؤُوسُ أَمْوَالِكُمْ لا تَظْلِمُونَ وَلا تُظْلَمُونَ ,== 0 */

}
