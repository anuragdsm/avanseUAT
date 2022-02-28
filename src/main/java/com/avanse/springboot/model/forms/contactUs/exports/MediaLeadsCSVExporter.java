package com.avanse.springboot.model.forms.contactUs.exports;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.avanse.springboot.model.forms.contactUs.AbstractExporter;
import com.avanse.springboot.model.forms.contactUs.Institute;
import com.avanse.springboot.model.forms.contactUs.Media;

public class MediaLeadsCSVExporter extends AbstractExporter {
	
	public void export (List<Media> listOfmediaLeads, HttpServletResponse response) throws IOException{
		super.setResponseHeader(response, "text/csv", ".csv", "mediaLeads_");
		
		ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(), CsvPreference.STANDARD_PREFERENCE);
		
		String [] csvHeader= {"ID", "Name of Person", "Media House", "Phone Number", "Contact-Email", "City", "SubjectLine"};
		String [] fieldMapping = {"id", "name", "mediaHouse", "phoneNumber", "emailId", "city", "subjectLine"};
		
		csvWriter.writeHeader(csvHeader);
		
		for(Media media: listOfmediaLeads) {
			media.setCity(media.getCity().replace("--", " "));
			media.setEmailId(media.getCity().replace("--", " "));
			media.setMediaHouse(media.getMediaHouse().replace("--", " "));
			media.setName(media.getName().replace("--", " "));
			media.setPhoneNumber(media.getPhoneNumber().replace("--", " "));
			media.setSubjectLine(media.getSubjectLine().replace("--", " "));
			csvWriter.write(media, fieldMapping);
			
			
		}
		
		csvWriter.close();

		
		
	}

}
