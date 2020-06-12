/**
 * Swagger Petstore
 * This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@swagger.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.swagger.api;

import io.swagger.model.Dog;
import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;

import javax.ws.rs.core.Response;
import org.apache.cxf.jaxrs.client.JAXRSClientFactory;
import org.apache.cxf.jaxrs.client.ClientConfiguration;
import org.apache.cxf.jaxrs.client.WebClient;


import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;




/**
 * Swagger Petstore
 *
 * <p>This spec is mainly for testing Petstore server and contains fake endpoints, models. Please do not use this for any other purpose. Special characters: \" \\
 *
 * API tests for DogApi 
 */
public class DogApiTest {


    private DogApi api;
    
    @Before
    public void setup() {
        JacksonJsonProvider provider = new JacksonJsonProvider();
        List providers = new ArrayList();
        providers.add(provider);
        
        api = JAXRSClientFactory.create("http://petstore.swagger.io:80/v2", DogApi.class, providers);
        org.apache.cxf.jaxrs.client.Client client = WebClient.client(api);
        
        ClientConfiguration config = WebClient.getConfig(client); 
    }

    /**
     * Add a new dog to the store
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addDogTest() {
        Dog body = null;
        //api.addDog(body);
        
        // TODO: test validations
        
        
    }
    /**
     * Deletes a dog
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteDogTest() {
        Long dogId = null;
        String apiKey = null;
        //api.deleteDog(dogId, apiKey);
        
        // TODO: test validations
        
        
    }
    /**
     * Find dog by ID
     *
     * Returns a single dog
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getDogByIdTest() {
        Long dogId = null;
        //Dog response = api.getDogById(dogId);
        //assertNotNull(response);
        // TODO: test validations
        
        
    }
    /**
     * Update an existing dog
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDogTest() {
        Dog body = null;
        //api.updateDog(body);
        
        // TODO: test validations
        
        
    }
    /**
     * Updates a dog
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateDogWithFormTest() {
        Long animalId = null;
        String name = null;
        String status = null;
        //api.updateDogWithForm(animalId, name, status);
        
        // TODO: test validations
        
        
    }
}