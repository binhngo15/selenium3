/**
 * 
 */
package net.saisoft.selenium.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Joe Guaneri
 *
 */
@Controller
public class MainController {

	private final List<FormBackingObject> fobs;
	
	/**
	 * 
	 */
	public MainController() {
		fobs = new LinkedList<FormBackingObject>();
	}

	@RequestMapping(value="/display", method=RequestMethod.GET)
	public String getDisplay() {
		return "display";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.GET)
	public String getAdd() {
		return "add";
	}
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public String postSave(@ModelAttribute("fobs") FormBackingObjectList list, BindingResult result) {
		return "redirect:/display";
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String postAdd(@ModelAttribute("fob") FormBackingObject fob, BindingResult result) {
		fobs.add(fob);
		return "redirect:/display";
	}
	
	@RequestMapping(value="/test", method=RequestMethod.GET)
	public String getTest() {
		return "Selenium_Test2";
	}
	
	@RequestMapping(value="/contextclick", method=RequestMethod.GET)
	public String getContextClick() {
		return "contextClick";
	}
	
	@RequestMapping(value="/doubleclick", method=RequestMethod.GET)
	public String getDoubleClick() {
		return "doubleClick";
	}
	
	@RequestMapping(value="/draganddrop", method=RequestMethod.GET)
	public String getDragAndDrop() {
		return "dragAndDrop";
	}
	
	@RequestMapping(value="/drag", method=RequestMethod.GET)
	public String getDrag() {
		return "drag";
	}
	
	@RequestMapping(value="/selectable", method=RequestMethod.GET)
	public String getSelectable() {
		return "selectable";
	}
	
	@RequestMapping(value="/sortable", method=RequestMethod.GET)
	public String getSortable() {
		return "sortable";
	}
	@ModelAttribute("fob")
	public FormBackingObject formBackingObject() {
		return new FormBackingObject();
	}
	
	@ModelAttribute("fobs")
	public FormBackingObjectList formBackingObjectList() {
		FormBackingObjectList list = new FormBackingObjectList();
		list.setFobs(fobs);
		return list;
	}
	
	public class FormBackingObject {
	
		private String firstName;
		
		private String lastName;
		
		private String emailAddress;
		
		private Boolean active;
		
		private Integer age;

		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}

		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		/**
		 * @return the emailAddress
		 */
		public String getEmailAddress() {
			return emailAddress;
		}

		/**
		 * @param emailAddress the emailAddress to set
		 */
		public void setEmailAddress(String emailAddress) {
			this.emailAddress = emailAddress;
		}

		/**
		 * @return the active
		 */
		public Boolean getActive() {
			return active;
		}

		/**
		 * @param active the active to set
		 */
		public void setActive(Boolean active) {
			this.active = active;
		}

		/**
		 * @return the age
		 */
		public Integer getAge() {
			return age;
		}

		/**
		 * @param age the age to set
		 */
		public void setAge(Integer age) {
			this.age = age;
		}
		
	}
	
	public class FormBackingObjectList {
		
		private List<FormBackingObject> fobs;

		/**
		 * @return the fobs
		 */
		public List<FormBackingObject> getFobs() {
			return fobs;
		}

		/**
		 * @param fobs the fobs to set
		 */
		public void setFobs(List<FormBackingObject> fobs) {
			this.fobs = fobs;
		}

	}
}
