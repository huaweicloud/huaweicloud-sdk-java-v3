package com.huaweicloud.sdk.nlp.v2.model;





import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.nlp.v2.model.DomainNamedEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RunNerDomainResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="named_entities")
    
    
    private List<DomainNamedEntity> namedEntities = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_code")
    
    
    private String errorCode;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="error_msg")
    
    
    private String errorMsg;

    public RunNerDomainResponse withNamedEntities(List<DomainNamedEntity> namedEntities) {
        this.namedEntities = namedEntities;
        return this;
    }

    
    public RunNerDomainResponse addNamedEntitiesItem(DomainNamedEntity namedEntitiesItem) {
        if(this.namedEntities == null) {
            this.namedEntities = new ArrayList<>();
        }
        this.namedEntities.add(namedEntitiesItem);
        return this;
    }

    public RunNerDomainResponse withNamedEntities(Consumer<List<DomainNamedEntity>> namedEntitiesSetter) {
        if(this.namedEntities == null) {
            this.namedEntities = new ArrayList<>();
        }
        namedEntitiesSetter.accept(this.namedEntities);
        return this;
    }

    /**
     * 命名实体识别结果。调用失败时无此字段。
     * @return namedEntities
     */
    public List<DomainNamedEntity> getNamedEntities() {
        return namedEntities;
    }

    public void setNamedEntities(List<DomainNamedEntity> namedEntities) {
        this.namedEntities = namedEntities;
    }

    

    public RunNerDomainResponse withErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    


    /**
     * 调用失败时的错误码，具体请参见错误码。调用成功时无此字段。
     * @return errorCode
     */
    public String getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    

    public RunNerDomainResponse withErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }

    


    /**
     * 调用失败时的错误信息。调用成功时无此字段。
     * @return errorMsg
     */
    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RunNerDomainResponse runNerDomainResponse = (RunNerDomainResponse) o;
        return Objects.equals(this.namedEntities, runNerDomainResponse.namedEntities) &&
            Objects.equals(this.errorCode, runNerDomainResponse.errorCode) &&
            Objects.equals(this.errorMsg, runNerDomainResponse.errorMsg);
    }
    @Override
    public int hashCode() {
        return Objects.hash(namedEntities, errorCode, errorMsg);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RunNerDomainResponse {\n");
        sb.append("    namedEntities: ").append(toIndentedString(namedEntities)).append("\n");
        sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
        sb.append("    errorMsg: ").append(toIndentedString(errorMsg)).append("\n");
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

