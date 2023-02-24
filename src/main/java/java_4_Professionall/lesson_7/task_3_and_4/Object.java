package java_4_Professionall.lesson_7.task_3_and_4;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "objects")
public class Object {
@XmlElement(name = "city")
public String city;
@XmlElement(name = "street")
public String street;
@XmlElement(name = "house")
public String house;

@Override
public String toString() {
	return "Object{" +
			"city='" + city + '\'' +
			", street='" + street + '\'' +
			", house='" + house + '\'' +
			'}';
}
}
