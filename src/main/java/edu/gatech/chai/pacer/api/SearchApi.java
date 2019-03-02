/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.4).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package edu.gatech.chai.pacer.api;

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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-01T16:08:08.392540-05:00[America/New_York]")
@Api(value = "search", description = "the search API")
public interface SearchApi {

    @ApiOperation(value = "searches indexes", nickname = "searchDecedent", notes = "By passing in the appropriate options, you can search for decedent indexes ", response = Organizations.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "search results matching criteria", response = Organizations.class),
        @ApiResponse(code = 400, message = "bad input parameter") })
    @RequestMapping(value = "/search",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Organizations> searchDecedent(@ApiParam(value = "Name of Organization") @Valid @RequestParam(value = "organization-name", required = false) String organizationName,@ApiParam(value = "Organization ID Set (Type|Id)") @Valid @RequestParam(value = "organization-id", required = false) String organizationId);

}
