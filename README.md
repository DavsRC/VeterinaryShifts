# Application Excercise #1: Sanipet

**_By: Sofía Idárraga_**

_In Progress_

---

**PART 1: Classes, Objects, Interfaces and Arrays**

**Sanipet** is a small Veterinary care center specialized in Cats and Dogs attendance from
Monday to Friday at 8AM - 7PM plus Saturdays at 9AM to 3PM. This establishment
needs a system able to keep a clinical history of their patients, registering medical,
surgery or aesthetic appointments, as well as medicine inventory management.

Considerations for the solution:
- **Patient:** Must be Cats or Dogs. For each pet you will assign a clinic historic number
  of 6 digits automatically. Plus, the name, breed, Owner, vaccines status, and last
  date of deparasitization.

- **Owner:** Any patient must have a owner personal data like DNI, name, surname,
  cellphone and age. An owner must be 18 years old or more.

- **Employees:** There are 2 types of Employees - Doctors and stylists. By default, there
  are only two doctors from Monday to Wednesday. From Friday to Saturday, there is
  another doctor. Stylists by default are 2 as well, and work from Monday to Saturday
  until 4PM.

- **Appointment:**  There are 3 types of appointments - Medical, Surgery or Aesthetic.
  When some of them are created it must consider some data of the Pet to be
  properly recognized, status of the appointment (Not started, Finished, Canceled,
  Absent) and the date within hour of the appointment. The status of the
  appointments when it is created by default is ‘Not started’.

- **Medicine:** Each of them has a name, presentation (Pills, syrup, pet-care), usage
  (Veterinarian/Human), quantity (usually in g or ml) of the medicine and stock
  available