/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package edu.gatech.chai.pacer.api;

import edu.gatech.chai.pacer.model.Organization;
import edu.gatech.chai.pacer.model.Organizations;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-02-26T16:50:41.046686-05:00[America/New_York]")
@Api(value = "manage", description = "the manage API")
public interface ManageApi {

    @ApiOperation(value = "adds a organization", nickname = "addOrganization", notes = "Adds a organization to the system", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "a organization created"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid"),
        @ApiResponse(code = 409, message = "organization already exists") })
    @RequestMapping(value = "/manage",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> addOrganization(@ApiParam(value = "Organization info to add"  )  @Valid @RequestBody Organization body);


    @ApiOperation(value = "delete a organization", nickname = "deleteOrganization", notes = "", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "a organization deleted"),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid") })
    @RequestMapping(value = "/manage/{id}",
        method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteOrganization(@ApiParam(value = "Organization ID to be deleted",required=true) @PathVariable("id") Integer id);


    @ApiOperation(value = "get a organization by ID", nickname = "getOrganization", notes = "", response = Organization.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "a organization", response = Organization.class),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid") })
    @RequestMapping(value = "/manage/{id}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Organization> getOrganization(@ApiParam(value = "Get a organization by ID",required=true) @PathVariable("id") Integer id);


    @ApiOperation(value = "get all organizations", nickname = "getOrganizations", notes = "", response = Organizations.class, authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "get all organizations in the system", response = Organizations.class),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid") })
    @RequestMapping(value = "/manage",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Organizations> getOrganizations();


    @ApiOperation(value = "edit a organization", nickname = "updateOrganization", notes = "", authorizations = {
        @Authorization(value = "basicAuth")    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "a organization updated"),
        @ApiResponse(code = 400, message = "invalid input, object invalid"),
        @ApiResponse(code = 401, message = "Authentication information is missing or invalid") })
    @RequestMapping(value = "/manage/{id}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    ResponseEntity<Void> updateOrganization(@ApiParam(value = "Organization ID to be updated",required=true) @PathVariable("id") Integer id,@ApiParam(value = "Organization info to add"  )  @Valid @RequestBody Organization body);

}
