package com.huaweicloud.sdk.iam.v3.model;




import java.util.Collections;


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



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;
    /**
     * Gets or Sets option
     */
    public static final class OptionEnum {

        
        /**
         * Enum PASSWORD_REGEX for value: "password_regex"
         */
        public static final OptionEnum PASSWORD_REGEX = new OptionEnum("password_regex");
        
        /**
         * Enum PASSWORD_REGEX_DESCRIPTION for value: "password_regex_description"
         */
        public static final OptionEnum PASSWORD_REGEX_DESCRIPTION = new OptionEnum("password_regex_description");
        

        private static final Map<String, OptionEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, OptionEnum> createStaticFields() {
            Map<String, OptionEnum> map = new HashMap<>();
            map.put("password_regex", PASSWORD_REGEX);
            map.put("password_regex_description", PASSWORD_REGEX_DESCRIPTION);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        OptionEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return String.valueOf(value);
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static OptionEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            OptionEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new OptionEnum(value);
            }
            return result;
        }

        public static OptionEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            OptionEnum result = STATIC_FIELDS.get(value);
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

    public KeystoneShowSecurityComplianceByOptionRequest withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * Get domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

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
        return Objects.equals(this.domainId, keystoneShowSecurityComplianceByOptionRequest.domainId) &&
            Objects.equals(this.option, keystoneShowSecurityComplianceByOptionRequest.option);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, option);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class KeystoneShowSecurityComplianceByOptionRequest {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
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

