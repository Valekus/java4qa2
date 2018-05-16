package LR_5_hw;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
    protected String sName;
    protected Date birthdate;

    public void setsName(String sName) {
        this.sName = sName;
    }

    public String getsName() {
        return sName;
    }

    public int getAge() {
        Calendar today = Calendar.getInstance();
        Calendar birthday = new GregorianCalendar();
        birthday.setTime(birthdate);

        int yearDif = today.get(Calendar.YEAR) - birthday.get(Calendar.YEAR);
        if (today.get(Calendar.MONTH) < birthday.get(Calendar.MONTH)) {
            yearDif = yearDif - 1;
        } else if (today.get(Calendar.MONTH) == birthday.get(Calendar.MONTH)
                && today.get(Calendar.DATE) < birthday.get(Calendar.DATE)) {
            yearDif = yearDif - 1;
        }
        return yearDif;
    }

    public void setBirthDate(int iYear, int iMonth, int iDay) {
        Calendar cal = Calendar.getInstance();
        cal.set(iYear, iMonth, iDay);
        this.birthdate = cal.getTime();
    }

    public Date getBirthDate() {
        return birthdate;
    }

    public String toString() {
        String s = "Name: " + getsName() + "\n";
        s += " Age: " + getAge() + "\n";
        return s;
    }

    public static void main(String[] args) {
        Person homer = new Person();
        homer.setsName("Valentin Usatiy");
        homer.setBirthDate(1986, Calendar.OCTOBER, 22);
        System.out.println(homer);
    }

}
