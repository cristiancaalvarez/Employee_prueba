package com.employees.employees.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name="Employee")
public class Employee extends Base{

    @Column(name="emp_first_name", nullable = false)
    private String firstName;

    @Column(name="emp_middle_name", nullable = false)
    private String middleName;

    @Column(name="emp_last_name", nullable = false)
    private String lastName;

    @ManyToOne(optional = false)
    @JoinColumn(name="city_id",nullable = false, foreignKey = @ForeignKey(name = "fk_employee_city"))
    private City city;

    @Column(name="emp_address", nullable = false)
    private String address;

    @Column(name="emp_date_birth", nullable = false)
    private LocalDate dateBirth;

    @Column(name="emp_telephone", nullable = false)
    private String telephone;

    @ManyToOne(optional = false)
    @JoinColumn(name="sta_id",nullable = false, foreignKey = @ForeignKey(name = "fk_employee_status"))
    private Status status;

}
