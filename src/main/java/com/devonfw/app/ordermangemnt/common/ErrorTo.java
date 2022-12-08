package com.devonfw.app.ordermangemnt.common;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.Type;

import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class ErrorTo  {

    private Integer code;
    private String message;

    /**
    * Get code
    * @return code
    **/
    @JsonProperty("code")
    public Integer getCode() {
        return code;
    }

    /**
     * Set code
     **/
    public void setCode(Integer code) {
        this.code = code;
    }

    public ErrorTo code(Integer code) {
        this.code = code;
        return this;
    }

    /**
    * Get message
    * @return message
    **/
    @JsonProperty("message")
    public String getMessage() {
        return message;
    }

    /**
     * Set message
     **/
    public void setMessage(String message) {
        this.message = message;
    }

    public ErrorTo message(String message) {
        this.message = message;
        return this;
    }

    /**
     * Create a string representation of this pojo.
     **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ErrorTo {\n");

        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private static String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}