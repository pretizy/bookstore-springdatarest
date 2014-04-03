/*
 * Created on 3 avr. 2014 ( Time 19:43:47 )
 * Generated by Telosys Tools Generator ( version 2.1.0 )
 */
// This Bean has a basic Primary Key (not composite) 

package org.demo.bean;

import java.io.Serializable;

//import javax.validation.constraints.* ;
//import org.hibernate.validator.constraints.* ;


import javax.persistence.*;

/**
 * Persistent class for entity stored in table "SYNOPSIS"
 *
 * @author Telosys Tools Generator
 *
 */

@Entity
@Table(name="SYNOPSIS", schema="ROOT" )
// Define named queries here
@NamedQueries ( {
  @NamedQuery ( name="Synopsis.countAll", query="SELECT COUNT(x) FROM Synopsis x" )
} )
public class Synopsis implements Serializable
{
    private static final long serialVersionUID = 1L;

    //----------------------------------------------------------------------
    // ENTITY PRIMARY KEY ( BASED ON A SINGLE FIELD )
    //----------------------------------------------------------------------
    @Id
    @Column(name="BOOK_ID", nullable=false)
    private Integer    bookId       ;


    //----------------------------------------------------------------------
    // ENTITY DATA FIELDS 
    //----------------------------------------------------------------------    
    @Column(name="SYNOPSIS")
    private String     synopsis     ;



    //----------------------------------------------------------------------
    // ENTITY LINKS ( RELATIONSHIP )
    //----------------------------------------------------------------------
    @ManyToOne
    @JoinColumn(name="BOOK_ID", referencedColumnName="ID", insertable=false, updatable=false)
    private Book book        ;


    //----------------------------------------------------------------------
    // CONSTRUCTOR(S)
    //----------------------------------------------------------------------
    public Synopsis()
    {
		super();
    }
    
    //----------------------------------------------------------------------
    // GETTER & SETTER FOR THE KEY FIELD
    //----------------------------------------------------------------------
    public void setBookId( Integer bookId )
    {
        this.bookId = bookId ;
    }
    public Integer getBookId()
    {
        return this.bookId;
    }

    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR FIELDS
    //----------------------------------------------------------------------
    //--- DATABASE MAPPING : SYNOPSIS ( LONG VARCHAR ) 
    public void setSynopsis( String synopsis )
    {
        this.synopsis = synopsis;
    }
    public String getSynopsis()
    {
        return this.synopsis;
    }


    //----------------------------------------------------------------------
    // GETTERS & SETTERS FOR LINKS
    //----------------------------------------------------------------------
    public void setBook( Book book )
    {
        this.book = book;
    }
    public Book getBook()
    {
        return this.book;
    }


    //----------------------------------------------------------------------
    // toString METHOD
    //----------------------------------------------------------------------
    public String toString() { 
        StringBuffer sb = new StringBuffer(); 
        sb.append("["); 
        sb.append(bookId);
        sb.append("]:"); 
        // attribute 'synopsis' not usable (type = String Long Text)
        return sb.toString(); 
    } 

}