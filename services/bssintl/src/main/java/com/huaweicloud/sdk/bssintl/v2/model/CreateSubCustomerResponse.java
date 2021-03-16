package com.huaweicloud.sdk.bssintl.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class CreateSubCustomerResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_id")
    
    private String domainId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="domain_name")
    
    private String domainName;

    public CreateSubCustomerResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    


    /**
     * |参数名称：客户ID| |参数的约束及描述：只有成功或客户向伙伴授权发生异常（CBC.5025）时才会返回，且只允许最大长度64的字符串|
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    

    public CreateSubCustomerResponse withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    


    /**
     * |参数名称：用户登录名| |参数的约束及描述：只有成功的时候才会返回，且只允许最大长度64的字符串|
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSubCustomerResponse createSubCustomerResponse = (CreateSubCustomerResponse) o;
        return Objects.equals(this.domainId, createSubCustomerResponse.domainId) &&
            Objects.equals(this.domainName, createSubCustomerResponse.domainName);
    }
    @Override
    public int hashCode() {
        return Objects.hash(domainId, domainName);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSubCustomerResponse {\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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

