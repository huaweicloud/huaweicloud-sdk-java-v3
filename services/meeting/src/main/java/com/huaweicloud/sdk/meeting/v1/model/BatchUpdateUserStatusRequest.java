package com.huaweicloud.sdk.meeting.v1.model;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class BatchUpdateUserStatusRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Request-Id")
    
    private String xRequestId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Accept-Language")
    
    private String acceptLanguage;
    /**
     * Gets or Sets value
     */
    public static class ValueEnum {

        
        /**
         * Enum NUMBER_0 for value: 0
         */
        public static final ValueEnum NUMBER_0 = new ValueEnum(0);
        
        /**
         * Enum NUMBER_1 for value: 1
         */
        public static final ValueEnum NUMBER_1 = new ValueEnum(1);
        

        public static final Map<Integer, ValueEnum> staticFields = new HashMap<Integer, ValueEnum>() {
            { 
                put(0, NUMBER_0);
                put(1, NUMBER_1);
            }
        };

        private Integer value;

        ValueEnum(Integer value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static ValueEnum fromValue(Integer value) {
            if( value == null ){
                return null;
            }
            ValueEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new ValueEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static ValueEnum valueOf(Integer value) {
            if( value == null ){
                return null;
            }
            ValueEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof ValueEnum) {
                return this.value.equals(((ValueEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="value")
    
    private ValueEnum value;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private List<String> body = null;
    
    public BatchUpdateUserStatusRequest withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    


    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    public BatchUpdateUserStatusRequest withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    


    /**
     * Get acceptLanguage
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public void setAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
    }

    public BatchUpdateUserStatusRequest withValue(ValueEnum value) {
        this.value = value;
        return this;
    }

    


    /**
     * Get value
     * @return value
     */
    public ValueEnum getValue() {
        return value;
    }

    public void setValue(ValueEnum value) {
        this.value = value;
    }

    public BatchUpdateUserStatusRequest withBody(List<String> body) {
        this.body = body;
        return this;
    }

    
    public BatchUpdateUserStatusRequest addBodyItem(String bodyItem) {
        if (this.body == null) {
            this.body = new ArrayList<>();
        }
        this.body.add(bodyItem);
        return this;
    }

    public BatchUpdateUserStatusRequest withBody(Consumer<List<String>> bodySetter) {
        if(this.body == null ){
            this.body = new ArrayList<>();
        }
        bodySetter.accept(this.body);
        return this;
    }

    /**
     * 企业用户帐号列表
     * @return body
     */
    public List<String> getBody() {
        return body;
    }

    public void setBody(List<String> body) {
        this.body = body;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BatchUpdateUserStatusRequest batchUpdateUserStatusRequest = (BatchUpdateUserStatusRequest) o;
        return Objects.equals(this.xRequestId, batchUpdateUserStatusRequest.xRequestId) &&
            Objects.equals(this.acceptLanguage, batchUpdateUserStatusRequest.acceptLanguage) &&
            Objects.equals(this.value, batchUpdateUserStatusRequest.value) &&
            Objects.equals(this.body, batchUpdateUserStatusRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(xRequestId, acceptLanguage, value, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchUpdateUserStatusRequest {\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
        sb.append("    acceptLanguage: ").append(toIndentedString(acceptLanguage)).append("\n");
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
        sb.append("}");
        return sb.toString();
    }
    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
    
}

