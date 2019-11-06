
package com.cristhianescobar.codegen.ws.models.typeahead;

import java.util.List;
import com.squareup.moshi.Json;


/**
 * The Response Schema
 * <p>
 * 
 * 
 */
public class Response {

    /**
     * The Minivenues Schema
     * <p>
     * 
     * (Required)
     * 
     */
    @Json(name = "minivenues")
    private List<Minivenue> minivenues = null;

    /**
     * The Minivenues Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public List<Minivenue> getMinivenues() {
        return minivenues;
    }

    /**
     * The Minivenues Schema
     * <p>
     * 
     * (Required)
     * 
     */
    public void setMinivenues(List<Minivenue> minivenues) {
        this.minivenues = minivenues;
    }

}
