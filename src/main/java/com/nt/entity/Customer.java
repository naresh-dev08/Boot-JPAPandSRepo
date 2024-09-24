package com.nt.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="JPA_CUSTOMER_TAB")
@Data
@RequiredArgsConstructor
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	
	
	//@GeneratedValue(strategy= GenerationType.AUTO) //generates value to the CID property automatically startng with 1
	//@Column(name="CID") Matching db table column name so no need to place @Column
	@Id
	@SequenceGenerator(name="gen1", sequenceName = "CUSTCID_SEQ",initialValue = 1, allocationSize = 1)  // customized sequence value
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "gen1")
	private Integer cid;
	
	@NonNull
	private String cname;
	
	//@Column(name="CADD", length = 20)
	//@Transient   //insert null value to the db so they can use this column in future without disturbing the table
	@NonNull 
	private String cadd;
	
	//@Column(name="BILLAMT") // column name optional when column name is matched with db table
	@NonNull
	private Float billamt;

}
