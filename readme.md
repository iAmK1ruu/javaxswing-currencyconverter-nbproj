# Real-time Currency Converter (BUGS TO BE FIXED...)

This is a simple real-time currency converter application that allows users to convert between various currencies. The project is built using Java and exported as a NetBeans project.

## Sample Output

![Sample Output](sample_cur.png)

## Features
- **Real-time conversion**: Convert between multiple currencies with up-to-date exchange rates using [Exchange Rate API](https://www.exchangerate-api.com/).
- **Simple UI**: User-friendly interface for easy use.
- **Multi-currency support**: Supports a wide range of currencies like PHP, USD, EUR, and more.

## Prerequisites

Before running the project, ensure you have the following installed:

- **Java Development Kit (JDK)**: Version 8 or higher.
- **NetBeans IDE**: Or any Java-supported IDE to run the project.

### Clone or Download the Repository
Clone this repository to your local machine using:
```bash
git clone https://github.com/yourusername/simpleCurrencyConverter.git
```
or download the .zip file and import on Apache NetBeans.

### Supports 193 currencies:
```bash
| Currency Code | Currency Name                                      |
|---------------|----------------------------------------------------|
| USD           | United States Dollar                               |
| AED           | United Arab Emirates Dirham                        |
| AFN           | Afghan Afghani                                     |
| ALL           | Albanian Lek                                       |
| AMD           | Armenian Dram                                      |
| ANG           | Netherlands Antillean Guilder                      |
| AOA           | Angolan Kwanza                                     |
| ARS           | Argentine Peso                                     |
| AUD           | Australian Dollar                                  |
| AWG           | Aruban Florin                                      |
| AZN           | Azerbaijani Manat                                  |
| BAM           | Bosnia and Herzegovina Convertible Mark            |
| BBD           | Barbadian Dollar                                   |
| BDT           | Bangladeshi Taka                                   |
| BGN           | Bulgarian Lev                                      |
| BHD           | Bahraini Dinar                                     |
| BIF           | Burundian Franc                                    |
| BMD           | Bermudian Dollar                                   |
| BND           | Brunei Dollar                                      |
| BOB           | Bolivian Boliviano                                 |
| BRL           | Brazilian Real                                     |
| BSD           | Bahamian Dollar                                    |
| BTN           | Bhutanese Ngultrum                                 |
| BWP           | Botswanan Pula                                     |
| BYN           | Belarusian Ruble                                   |
| BZD           | Belize Dollar                                      |
| CAD           | Canadian Dollar                                    |
| CDF           | Congolese Franc                                    |
| CHF           | Swiss Franc                                        |
| CLP           | Chilean Peso                                       |
| CNY           | Chinese Yuan                                       |
| COP           | Colombian Peso                                     |
| CRC           | Costa Rican Colón                                  |
| CUP           | Cuban Peso                                         |
| CVE           | Cape Verdean Escudo                                |
| CZK           | Czech Koruna                                       |
| DJF           | Djiboutian Franc                                   |
| DKK           | Danish Krone                                       |
| DOP           | Dominican Peso                                     |
| DZD           | Algerian Dinar                                     |
| EGP           | Egyptian Pound                                     |
| ERN           | Eritrean Nakfa                                     |
| ETB           | Ethiopian Birr                                     |
| EUR           | Euro                                               |
| FJD           | Fijian Dollar                                      |
| FKP           | Falkland Islands Pound                             |
| FOK           | Faroese Króna                                      |
| GBP           | British Pound Sterling                             |
| GEL           | Georgian Lari                                      |
| GGP           | Guernsey Pound                                     |
| GHS           | Ghanaian Cedi                                      |
| GIP           | Gibraltar Pound                                    |
| GMD           | Gambian Dalasi                                     |
| GNF           | Guinean Franc                                      |
| GTQ           | Guatemalan Quetzal                                 |
| GYD           | Guyanese Dollar                                    |
| HKD           | Hong Kong Dollar                                   |
| HNL           | Honduran Lempira                                   |
| HRK           | Croatian Kuna                                      |
| HTG           | Haitian Gourde                                     |
| HUF           | Hungarian Forint                                   |
| IDR           | Indonesian Rupiah                                  |
| ILS           | Israeli New Shekel                                 |
| IMP           | Isle of Man Pound                                  |
| INR           | Indian Rupee                                       |
| IQD           | Iraqi Dinar                                        |
| IRR           | Iranian Rial                                       |
| ISK           | Icelandic Króna                                    |
| JEP           | Jersey Pound                                       |
| JMD           | Jamaican Dollar                                    |
| JOD           | Jordanian Dinar                                    |
| JPY           | Japanese Yen                                       |
| KES           | Kenyan Shilling                                    |
| KGS           | Kyrgyzstani Som                                    |
| KHR           | Cambodian Riel                                     |
| KID           | Kiribati Dollar                                    |
| KMF           | Comorian Franc                                     |
| KRW           | South Korean Won                                   |
| KWD           | Kuwaiti Dinar                                      |
| KYD           | Cayman Islands Dollar                              |
| KZT           | Kazakhstani Tenge                                  |
| LAK           | Lao Kip                                            |
| LBP           | Lebanese Pound                                     |
| LKR           | Sri Lankan Rupee                                   |
| LRD           | Liberian Dollar                                    |
| LSL           | Lesotho Loti                                       |
| LYD           | Libyan Dinar                                       |
| MAD           | Moroccan Dirham                                    |
| MDL           | Moldovan Leu                                       |
| MGA           | Malagasy Ariary                                    |
| MKD           | Macedonian Denar                                   |
| MMK           | Myanmar Kyat                                       |
| MNT           | Mongolian Tögrög                                   |
| MOP           | Macanese Pataca                                    |
| MRU           | Mauritanian Ouguiya                                |
| MUR           | Mauritian Rupee                                    |
| MVR           | Maldivian Rufiyaa                                  |
| MWK           | Malawian Kwacha                                    |
| MXN           | Mexican Peso                                       |
| MYR           | Malaysian Ringgit                                  |
| MZN           | Mozambican Metical                                 |
| NAD           | Namibian Dollar                                    |
| NGN           | Nigerian Naira                                     |
| NIO           | Nicaraguan Córdoba                                 |
| NOK           | Norwegian Krone                                    |
| NPR           | Nepalese Rupee                                     |
| NZD           | New Zealand Dollar                                 |
| OMR           | Omani Rial                                         |
| PAB           | Panamanian Balboa                                  |
| PEN           | Peruvian Sol                                       |
| PGK           | Papua New Guinean Kina                             |
| PHP           | Philippine Peso                                    |
| PKR           | Pakistani Rupee                                    |
| PLN           | Polish Zloty                                       |
| PYG           | Paraguayan Guaraní                                 |
| QAR           | Qatari Rial                                        |
| RON           | Romanian Leu                                       |
| RSD           | Serbian Dinar                                      |
| RUB           | Russian Ruble                                      |
| RWF           | Rwandan Franc                                      |
| SAR           | Saudi Riyal                                        |
| SBD           | Solomon Islands Dollar                             |
| SCR           | Seychellois Rupee                                  |
| SDG           | Sudanese Pound                                     |
| SEK           | Swedish Krona                                      |
| SGD           | Singapore Dollar                                   |
| SHP           | Saint Helenian Pound                               |
| SLE           | Sierra Leonean Leone                               |
| SLL           | Sierra Leonean Leone                               |
| SOS           | Somali Shilling                                    |
| SRD           | Surinamese Dollar                                  |
| SSP           | South Sudanese Pound                               |
| STN           | São Tomé and Príncipe Dobra                        |
| SYP           | Syrian Pound                                       |
| SZL           | Swazi Lilangeni                                    |
| THB           | Thai Baht                                          |
| TJS           | Tajikistani Somoni                                 |
| TMT           | Turkmenistani Manat                                |
| TND           | Tunisian Dinar                                     |
| TOP           | Tongan Paʻanga                                     |
| TRY           | Turkish Lira                                       |
| TTD           | Trinidad and Tobago Dollar                         |
| TVD           | Tuvaluan Dollar                                    |
| TWD           | New Taiwan Dollar                                  |
| TZS           | Tanzanian Shilling                                 |
| UAH           | Ukrainian Hryvnia                                  |
| UGX           | Ugandan Shilling                                   |
| UYU           | Uruguayan Peso                                     |
| UZS           | Uzbekistani Som                                    |
| VES           | Venezuelan Bolívar                                 |
| VND           | Vietnamese Dong                                    |
| VUV           | Vanuatu Vatu                                       |
| WST           | Samoan Tala                                        |
| XAF           | Central African CFA Franc                          |
| XCD           | East Caribbean Dollar                              |
| XDR           | Special Drawing Rights                             |
| XOF           | West African CFA Franc                             |
| XPF           | CFP Franc                                          |
| YER           | Yemeni Rial                                        |
| ZAR           | South African Rand                                 |
| ZMW           | Zambian Kwacha                                     |
| ZWL           | Zimbabwean Dollar                                  |
```
