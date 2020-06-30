package com.huaweicloud.sdk.iam.v3.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class KeystoneShowSecurityComplianceByOptionRequest  {

    /**
     * Gets or Sets option
     */
    public static class OptionEnum {

        
        /**
         * Enum PASSWORD_REGEX for value: "password_regex"
         */
        public static final OptionEnum PASSWORD_REGEX = new OptionEnum("password_regex");
        
        /**
         * Enum PASSWORD_REGEX_DESCRIPTION for value: "password_regex_description"
         */
        public static final OptionEnum PASSWORD_REGEX_DESCRIPTION = new OptionEnum("password_regex_description");
        

        public static final Map<String, OptionEnum> staticFields = new HashMap<String, OptionEnum>() {
            { 
                put("password_regex", PASSWORD_REGEX);
                put("password_regex_description", PASSWORD_REGEX_DESCRIPTION);
            }
        };

        private String value;

        OptionEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OptionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OptionEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new OptionEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static OptionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OptionEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof OptionEnum) {
                return this.value.equals(((OptionEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="option")
    
    private OptionEnum option;

    public KeystoneShowSecurityComplianceByOptionRequest withOption(OptionEnum option) {
        this.option = option;
        return this;
    }

    


    /**
     * Get option
     * @return option
     */
    public OptionEnum getOption() {
        return option;
    }

    public void setOption(OptionEnum option) {
        this.option = option;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        KeystoneShowSecurityComplianceByOptionRequest keystoneShowSecurityComplianceByOptionRequest = (KeystoneShowSecurityComplianceByOptionRequest) o;
        return Objects.equals(this.option, keystoneShowSecurityComplianceByOptionRequest.option);
    }
    @Override
    public int hashCode() {
        return Objects.hash(option);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowSecurityComplianceByOptionRequest {\n");
        sb.append("    option: ").append(toIndentedString(option)).append("\n");
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

