package se.dsve.bankstuff;

/*
 * ----------------------------------------------------------------------------
 * Copyright (c) 2019-2023 Marcus Medina, DSVE AB.
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License.
 * ----------------------------------------------------------------------------
 */

// Lönekonto som ärver från basklassen BaseAccount
public class SalaryAccount extends BaseAccount {

    // Anropar basklassens konstruktor
    public SalaryAccount() {
        super();
        // Anropa moderklassens konstructor
    }

    // De metoder som hanterar insättningar, uttag och saldo
    // är redan definierade i BaseAccount och ärver därför hit.
}


