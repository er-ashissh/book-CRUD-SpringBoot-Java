package com.example.SimplestCRUDExample.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="Books")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String title;

    @Column
    private String author;

    public void setTitle(String title)   
    {  
    	this.title = title;  
    } 
    
    public String getTitle()   
    {  
    	return title;  
    }  
    
    public void setAuthor(String author)   
    {  
    	this.author = author;  
    }  
    
    public String getAuthor()   
    {  
    	return author;  
    }  

}
