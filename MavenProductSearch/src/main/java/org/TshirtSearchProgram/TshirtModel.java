package org.TshirtSearchProgram;

import java.util.Collections;
import java.util.Comparator;

public class TshirtModel {
	private String ID;
    private String Name;
    private String Color;
    private String Gender;
    private String Size;
    private float Price;
    private float Rating;
	

    public TshirtModel(){}

    public TshirtModel(String ID, String Name, String Color, String Gender, String Size, float Price, float Rating) {
        this.ID = ID;
        this.Name = Name;
        this.Color = Color;
        this.Gender = Gender;
        this.Size = Size;
        this.Price = Price;
        this.Rating = Rating;
    }

    public String getID()
    {
        return ID;
    }
    public void setTshirtID(String ID)
    {
        this.ID=ID;
    }

    public String getName()
    {
        return Name;
    }
    public void setName(String Name)
    {
        this.Name=Name;
    }

    public String getColor()
    {
        return Color;
    }
    public void setColor(String Color)
    {
        this.Color=Color;
    }
    public String getGender()
    {
        return Gender;
    }
    public void setGender(String Gender)
    {
        this.Gender=Gender;
    }
    public String getSize()
    {
        return Size;
    }
    public void setSize(String Size)
    {
        this.Size=Size;
    }

    public float getPrice()
    {
        return Price;
    }
    public void setPrice(float Price)
    {
        this.Price=Price;
    }

    public float getRating()
    {
        return Rating;
    }
    public void setRating(float Rating)
    {
        this.Rating=Rating;
    }


}
