# Lab 7 Task 2 – Inheritance and Multi-Level Class Hierarchy

This program shows how inheritance works in Java using abstract classes and multi-level class structures.

The main abstract class **Animal** defines basic info for all animals:
- name  
- age  
- weight  
- and two abstract methods: `eat()` and `getVoice()`

### Class Structure
- **Animal**
  - → **Mammal** → **Dog**
  - → **Bird** → **Pigeon**
  - → **Fish** → **Blowfish**

Each subclass overrides the abstract methods and adds its own specific field (like `breed`, `species`, or `diameter`).

---

**Author:** Saad Hakim  
**Student ID:** 61551  
**Group:** 7
