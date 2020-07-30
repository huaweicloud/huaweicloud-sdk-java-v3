package com.huaweicloud.sdk.mpc.v1.model;




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
public class ShowTenantInfoResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private Integer status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_verified")
    
    private Integer isVerified;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_open")
    
    private Integer isOpen;

    public ShowTenantInfoResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    


    /**
     * 租户状态,0表示正常，1表示冻结，2表示删除 
     * minimum: 0
     * maximum: 2
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ShowTenantInfoResponse withIsVerified(Integer isVerified) {
        this.isVerified = isVerified;
        return this;
    }

    


    /**
     * 是否实名认证，0标示否，1标示已实名 
     * minimum: 0
     * maximum: 2
     * @return isVerified
     */
    public Integer getIsVerified() {
        return isVerified;
    }

    public void setIsVerified(Integer isVerified) {
        this.isVerified = isVerified;
    }

    public ShowTenantInfoResponse withIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
        return this;
    }

    


    /**
     * 是否已开通服务，0标示否，1标示已开通 
     * minimum: 0
     * maximum: 2
     * @return isOpen
     */
    public Integer getIsOpen() {
        return isOpen;
    }

    public void setIsOpen(Integer isOpen) {
        this.isOpen = isOpen;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowTenantInfoResponse showTenantInfoResponse = (ShowTenantInfoResponse) o;
        return Objects.equals(this.status, showTenantInfoResponse.status) &&
            Objects.equals(this.isVerified, showTenantInfoResponse.isVerified) &&
            Objects.equals(this.isOpen, showTenantInfoResponse.isOpen);
    }
    @Override
    public int hashCode() {
        return Objects.hash(status, isVerified, isOpen);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTenantInfoResponse {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    isVerified: ").append(toIndentedString(isVerified)).append("\n");
        sb.append("    isOpen: ").append(toIndentedString(isOpen)).append("\n");
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

