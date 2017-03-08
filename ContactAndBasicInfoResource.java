package org.ooad.facebook_v01.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.ooad.facebook_v01.model.ContactAndBasicInfo;
import org.ooad.facebook_v01.service.ContactAndBasicInfoService;


@Path("/contactandbasicinfo")
public class ContactAndBasicInfoResource {
	
	ContactAndBasicInfoService cbis=new ContactAndBasicInfoService();
	
	@GET
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	@Path("/{userId}")
	public Response getContactAndBasicInfo(@PathParam("userId") String id) throws Exception{
		int uid=Integer.parseInt(id);
		ContactAndBasicInfo cbi=new ContactAndBasicInfo();
		
		int retvalue=cbis.getContactAndBasicInfo(uid, cbi);
		if(retvalue==1){
			return Response.status(201).entity(cbi).build();
		}
		else if(retvalue==-1){
			return Response.status(401).entity("SQLException").build();
		}
		else if(retvalue==-2){
			return Response.status(402).entity("ClassNotFoundException").build();
		}
		else{
			return Response.status(403).entity("Exception").build();
		}
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("mobile/{userId}")
	public Response editPhoneNumber(@PathParam("userId") String id,@FormParam("mobile") String phonenumber) throws Exception{
		int uid=Integer.parseInt(id);
		int retvalue=cbis.editPhoneNumber(uid, phonenumber);
		System.out.println("phonenumber "+phonenumber);
		System.out.println("retvalue "+retvalue);
		if(retvalue==1){
			return Response.status(201).entity("Success").build();
		}
		else if(retvalue==-1){
			return Response.status(401).entity("SQLException").build();
		}
		else if(retvalue==-2){
			return Response.status(402).entity("ClassNotFoundException").build();
		}
		else{
			return Response.status(403).entity("Exception").build();
		}
	}
	
	//if needed in case
	/*@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	@Path("mobile/{userId}")
	public Response deletePhoneNumber(@PathParam("userId") String id) throws Exception{
		int uid=Integer.parseInt(id);
		int retvalue=cbis.deletePhoneNumber(uid);
		System.out.println("retvalue "+retvalue);
		if(retvalue==1){
			return Response.status(201).entity("Success").build();
		}
		else if(retvalue==-1){
			return Response.status(401).entity("SQLException").build();
		}
		else if(retvalue==-2){
			return Response.status(402).entity("ClassNotFoundException").build();
		}
		else{
			return Response.status(403).entity("Exception").build();
		}
	}*/
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("email/{userId}")
	public Response editEmailAddress(@PathParam("userId") String id,@FormParam("userdetails_email") String email) throws Exception{
		int uid=Integer.parseInt(id);
		int retvalue=cbis.editEmailAddress(uid, email);
		
		if(retvalue==1){
			return Response.status(201).entity("Success").build();
		}
		else if(retvalue==-1){
			return Response.status(401).entity("SQLException").build();
		}
		else if(retvalue==-2){
			return Response.status(402).entity("ClassNotFoundException").build();
		}
		else{
			return Response.status(403).entity("Exception").build();
		}
	}
	
	//if needed in case
	/*@DELETE
	@Produces(MediaType.TEXT_PLAIN)
	@Path("email/{userId}")
	public Response deleteEmail(@PathParam("userId") String id) throws Exception{
		int uid=Integer.parseInt(id);
		int retvalue=cbis.deleteEmailAddress(uid);
		System.out.println("retvalue "+retvalue);
		if(retvalue==1){
			return Response.status(201).entity("Success").build();
		}
		else if(retvalue==-1){
			return Response.status(401).entity("SQLException").build();
		}
		else if(retvalue==-2){
			return Response.status(402).entity("ClassNotFoundException").build();
		}
		else{
			return Response.status(403).entity("Exception").build();
		}
	}*/
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("dob/{userId}")
	public Response editDOB(@PathParam("userId") String id,@FormParam("userdetails_dob") String dob) throws Exception{
		int uid=Integer.parseInt(id);
		int retvalue=cbis.editDOB(uid, dob);
		
		if(retvalue==1){
			return Response.status(201).entity("Success").build();
		}
		else if(retvalue==-1){
			return Response.status(401).entity("SQLException").build();
		}
		else if(retvalue==-2){
			return Response.status(402).entity("ClassNotFoundException").build();
		}
		else{
			return Response.status(403).entity("Exception").build();
		}
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("gender/{userId}")
	public Response editGender(@PathParam("userId") String id,@FormParam("userdetails_gender") String gender) throws Exception{
		int uid=Integer.parseInt(id);
		int retvalue=cbis.editGender(uid, gender.charAt(0));
		
		if(retvalue==1){
			return Response.status(201).entity("Success").build();
		}
		else if(retvalue==-1){
			return Response.status(401).entity("SQLException").build();
		}
		else if(retvalue==-2){
			return Response.status(402).entity("ClassNotFoundException").build();
		}
		else{
			return Response.status(403).entity("Exception").build();
		}
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("useraddress/{userId}")
	public Response editUserAddress(@PathParam("userId") String id,@FormParam("contact_and_basic_info_user_address") String addr) throws Exception{
		int uid=Integer.parseInt(id);
		int retvalue=cbis.editUserAddress(uid, addr);
		
		if(retvalue==1){
			return Response.status(201).entity("Success").build();
		}
		else if(retvalue==-1){
			return Response.status(401).entity("SQLException").build();
		}
		else if(retvalue==-2){
			return Response.status(402).entity("ClassNotFoundException").build();
		}
		else{
			return Response.status(403).entity("Exception").build();
		}
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("interestedin/{userId}")
	public Response editInterestedIn(@PathParam("userId") String id,@FormParam("contact_and_basic_info_interested_in") String interest) throws Exception{
		int uid=Integer.parseInt(id);
		int retvalue=cbis.editInterestedIn(uid, interest.charAt(0));
		
		if(retvalue==1){
			return Response.status(201).entity("Success").build();
		}
		else if(retvalue==-1){
			return Response.status(401).entity("SQLException").build();
		}
		else if(retvalue==-2){
			return Response.status(402).entity("ClassNotFoundException").build();
		}
		else{
			return Response.status(403).entity("Exception").build();
		}
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("religiousview/{userId}")
	public Response editReligion(@PathParam("userId") String id,@FormParam("religions_religion_name") String religion,
			@FormParam("contact_and_basic_info_religious_view") String religion_view) throws Exception{
		int uid=Integer.parseInt(id);
		int r1=cbis.editReligionName(uid, religion);
		int r2=cbis.editReligiousView(uid, religion_view);
		int retvalue=r1&r2;
		
		if(retvalue==1){
			return Response.status(201).entity("Success").build();
		}
		else if(retvalue==-1){
			return Response.status(401).entity("SQLException").build();
		}
		else if(retvalue==-2){
			return Response.status(402).entity("ClassNotFoundException").build();
		}
		else{
			return Response.status(403).entity("Exception").build();
		}
	}
	
	@POST
	@Produces(MediaType.TEXT_PLAIN)
	@Path("politicalview/{userId}")
	public Response editPoliticalView(@PathParam("userId") String id,@FormParam("political_views_name") String political_view_name,
			@FormParam("contact_and_basic_info_political_view") String political_view) throws Exception{
		int uid=Integer.parseInt(id);
		int r1=cbis.editPoliticalViewName(uid, political_view_name);
		int r2=cbis.editPoliticalView(uid, political_view);
		int retvalue=r1&r2;
		
		if(retvalue==1){
			return Response.status(201).entity("Success").build();
		}
		else if(retvalue==-1){
			return Response.status(401).entity("SQLException").build();
		}
		else if(retvalue==-2){
			return Response.status(402).entity("ClassNotFoundException").build();
		}
		else{
			return Response.status(403).entity("Exception").build();
		}
	}
	
}
