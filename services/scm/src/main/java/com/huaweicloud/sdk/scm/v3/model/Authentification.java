package com.huaweicloud.sdk.scm.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Authentification
 */
public class Authentification  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_name")
    
    private String recordName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_type")
    
    private String recordType;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="record_value")
    
    private String recordValue;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain")
    
    private String domain;

    public Authentification withRecordName(String recordName) {
        this.recordName = recordName;
        return this;
    }

    


    /**
     * 域名校验值名字。
     * @return recordName
     */
    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public Authentification withRecordType(String recordType) {
        this.recordType = recordType;
        return this;
    }

    


    /**
     * 域名校验值类型。
     * @return recordType
     */
    public String getRecordType() {
        return recordType;
    }

    public void setRecordType(String recordType) {
        this.recordType = recordType;
    }

    public Authentification withRecordValue(String recordValue) {
        this.recordValue = recordValue;
        return this;
    }

    


    /**
     * 域名校验值。
     * @return recordValue
     */
    public String getRecordValue() {
        return recordValue;
    }

    public void setRecordValue(String recordValue) {
        this.recordValue = recordValue;
    }

    public Authentification withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    


    /**
     * 校验值对应的域名。
     * @return domain
     */
    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Authentification authentification = (Authentification) o;
        return Objects.equals(this.recordName, authentification.recordName) &&
            Objects.equals(this.recordType, authentification.recordType) &&
            Objects.equals(this.recordValue, authentification.recordValue) &&
            Objects.equals(this.domain, authentification.domain);
    }
    @Override
    public int hashCode() {
        return Objects.hash(recordName, recordType, recordValue, domain);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Authentification {\n");
        sb.append("    recordName: ").append(toIndentedString(recordName)).append("\n");
        sb.append("    recordType: ").append(toIndentedString(recordType)).append("\n");
        sb.append("    recordValue: ").append(toIndentedString(recordValue)).append("\n");
        sb.append("    domain: ").append(toIndentedString(domain)).append("\n");
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

