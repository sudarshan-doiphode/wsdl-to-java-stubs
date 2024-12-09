
package dev.darsh.generatedStubs;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="student">
 *           <complexType>
 *             <complexContent>
 *               <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 <sequence>
 *                   <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                   <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   <element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *                 </sequence>
 *               </restriction>
 *             </complexContent>
 *           </complexType>
 *         </element>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "student"
})
@XmlRootElement(name = "GetStudentResponse")
public class GetStudentResponse {

    @XmlElement(required = true)
    protected GetStudentResponse.Student student;

    /**
     * Gets the value of the student property.
     * 
     * @return
     *     possible object is
     *     {@link GetStudentResponse.Student }
     *     
     */
    public GetStudentResponse.Student getStudent() {
        return student;
    }

    /**
     * Sets the value of the student property.
     * 
     * @param value
     *     allowed object is
     *     {@link GetStudentResponse.Student }
     *     
     */
    public void setStudent(GetStudentResponse.Student value) {
        this.student = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>{@code
     * <complexType>
     *   <complexContent>
     *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       <sequence>
     *         <element name="id" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *         <element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         <element name="age" type="{http://www.w3.org/2001/XMLSchema}int"/>
     *       </sequence>
     *     </restriction>
     *   </complexContent>
     * </complexType>
     * }</pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "id",
        "name",
        "age"
    })
    public static class Student {

        protected int id;
        @XmlElement(required = true)
        protected String name;
        protected int age;

        /**
         * Gets the value of the id property.
         * 
         */
        public int getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         */
        public void setId(int value) {
            this.id = value;
        }

        /**
         * Gets the value of the name property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * Sets the value of the name property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * Gets the value of the age property.
         * 
         */
        public int getAge() {
            return age;
        }

        /**
         * Sets the value of the age property.
         * 
         */
        public void setAge(int value) {
            this.age = value;
        }

    }

}
