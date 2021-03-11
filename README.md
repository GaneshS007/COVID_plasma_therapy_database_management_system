# COVID plasma therapy database management system

### ABSTRACT

Development of Covid-19 plasma therapy system is an attempt to reduce the time of searching for the plasma there by decreasing the chance of risk of COVID patient’s death.

“Covid-19 plasma therapy system” or “CPT system” is a web based application that supports registration of cured covid-19 patients.

It helps the doctors of different hospital to view the plasma available in the different blood banks.

The main goal of this software is to give working solution to store, manage and retrieve the data of cured covid-19 patients.

---

### SOFTWARE REQUIREMENTS

**Developer IDE** : Eclipse IDE for Enterprise Java Developers - 2020-09

**Database Server** : Mysql

**Database IDE** : Sqlyog or Mysql workbench

**Application Server** : Apache Tomcat version 9.x

***

**Note** : Initially, while running the website through IDE make sure that you have internet connection to load some jquery plugins.

---

### WORKING:

There is a general page or the gateway for donor, blood bank and hosptial (Donor.jsp).

Through this (Donor.jsp) page, blood bank admin can go to the blood bank specific page with valid credentials.

Similary hospital admin can go to the hospital specific page with valid credentials.

**Donor.jsp**

Interested donor can visit this general page and register themselves for the donation.

Available blood banks with its contact details are visible in this website.

**Home1.jsp** : This page is for blood bank to verify the donor and upload plasma details of the donor after donating.

**Home2.jsp** : This page is for blood bank to view orders by the hospitals and update the plasma delivery status.

**Home3.jsp**

This page is for hospital to order the plasma based on the details visible on this page.

---

**Note** : You can add new blood banks and hospitals through sign-up page.

---
