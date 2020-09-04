package com.huaweicloud.sdk.vpc.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.vpc.v2.model.VpcInfo;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RejectVpcPeeringResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;
    /**
     * 功能说明：对等连接状态 取值范围： - PENDING_ACCEPTANCE：等待接受 - REJECTED：已拒绝。 - EXPIRED：已过期。 - DELETED：已删除。 - ACTIVE：活动的。
     */
    public static class StatusEnum {

        
        /**
         * Enum PENDING_ACCEPTANCE for value: "PENDING_ACCEPTANCE"
         */
        public static final StatusEnum PENDING_ACCEPTANCE = new StatusEnum("PENDING_ACCEPTANCE");
        
        /**
         * Enum REJECTED for value: "REJECTED"
         */
        public static final StatusEnum REJECTED = new StatusEnum("REJECTED");
        
        /**
         * Enum EXPIRED for value: "EXPIRED"
         */
        public static final StatusEnum EXPIRED = new StatusEnum("EXPIRED");
        
        /**
         * Enum DELETED for value: "DELETED"
         */
        public static final StatusEnum DELETED = new StatusEnum("DELETED");
        
        /**
         * Enum ACTIVE for value: "ACTIVE"
         */
        public static final StatusEnum ACTIVE = new StatusEnum("ACTIVE");
        

        public static final Map<String, StatusEnum> staticFields = new HashMap<String, StatusEnum>() {
            { 
                put("PENDING_ACCEPTANCE", PENDING_ACCEPTANCE);
                put("REJECTED", REJECTED);
                put("EXPIRED", EXPIRED);
                put("DELETED", DELETED);
                put("ACTIVE", ACTIVE);
            }
        };

        private String value;

        StatusEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static StatusEnum fromValue(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result == null) {
                result = staticFields.putIfAbsent(value, new StatusEnum(value));
                if (result == null) {
                    result = staticFields.get(value);
                }
            }
            return result;
        }

        public static StatusEnum valueOf(String value) {
            if( value == null ){
                return null;
            }
            StatusEnum result = staticFields.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj != null && obj instanceof StatusEnum) {
                return this.value.equals(((StatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="status")
    
    private StatusEnum status;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="request_vpc_info")
    
    private VpcInfo requestVpcInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accept_vpc_info")
    
    private VpcInfo acceptVpcInfo = null;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="created_at")
    
    private String createdAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="updated_at")
    
    private String updatedAt;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private String description;

    public RejectVpcPeeringResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 对等连接ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public RejectVpcPeeringResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 功能说明：对等连接名称 取值范围：支持1~64个字符
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RejectVpcPeeringResponse withStatus(StatusEnum status) {
        this.status = status;
        return this;
    }

    


    /**
     * 功能说明：对等连接状态 取值范围： - PENDING_ACCEPTANCE：等待接受 - REJECTED：已拒绝。 - EXPIRED：已过期。 - DELETED：已删除。 - ACTIVE：活动的。
     * @return status
     */
    public StatusEnum getStatus() {
        return status;
    }

    public void setStatus(StatusEnum status) {
        this.status = status;
    }

    public RejectVpcPeeringResponse withRequestVpcInfo(VpcInfo requestVpcInfo) {
        this.requestVpcInfo = requestVpcInfo;
        return this;
    }

    public RejectVpcPeeringResponse withRequestVpcInfo(Consumer<VpcInfo> requestVpcInfoSetter) {
        if(this.requestVpcInfo == null ){
            this.requestVpcInfo = new VpcInfo();
            requestVpcInfoSetter.accept(this.requestVpcInfo);
        }
        
        return this;
    }


    /**
     * Get requestVpcInfo
     * @return requestVpcInfo
     */
    public VpcInfo getRequestVpcInfo() {
        return requestVpcInfo;
    }

    public void setRequestVpcInfo(VpcInfo requestVpcInfo) {
        this.requestVpcInfo = requestVpcInfo;
    }

    public RejectVpcPeeringResponse withAcceptVpcInfo(VpcInfo acceptVpcInfo) {
        this.acceptVpcInfo = acceptVpcInfo;
        return this;
    }

    public RejectVpcPeeringResponse withAcceptVpcInfo(Consumer<VpcInfo> acceptVpcInfoSetter) {
        if(this.acceptVpcInfo == null ){
            this.acceptVpcInfo = new VpcInfo();
            acceptVpcInfoSetter.accept(this.acceptVpcInfo);
        }
        
        return this;
    }


    /**
     * Get acceptVpcInfo
     * @return acceptVpcInfo
     */
    public VpcInfo getAcceptVpcInfo() {
        return acceptVpcInfo;
    }

    public void setAcceptVpcInfo(VpcInfo acceptVpcInfo) {
        this.acceptVpcInfo = acceptVpcInfo;
    }

    public RejectVpcPeeringResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    


    /**
     * 功能说明：资源创建UTC时间 格式：yyyy-MM-ddTHH:mm:ss
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public RejectVpcPeeringResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    


    /**
     * 功能说明：资源更新UTC时间 格式：yyyy-MM-ddTHH:mm:ss
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public RejectVpcPeeringResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    


    /**
     * 对等连接描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RejectVpcPeeringResponse rejectVpcPeeringResponse = (RejectVpcPeeringResponse) o;
        return Objects.equals(this.id, rejectVpcPeeringResponse.id) &&
            Objects.equals(this.name, rejectVpcPeeringResponse.name) &&
            Objects.equals(this.status, rejectVpcPeeringResponse.status) &&
            Objects.equals(this.requestVpcInfo, rejectVpcPeeringResponse.requestVpcInfo) &&
            Objects.equals(this.acceptVpcInfo, rejectVpcPeeringResponse.acceptVpcInfo) &&
            Objects.equals(this.createdAt, rejectVpcPeeringResponse.createdAt) &&
            Objects.equals(this.updatedAt, rejectVpcPeeringResponse.updatedAt) &&
            Objects.equals(this.description, rejectVpcPeeringResponse.description);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, status, requestVpcInfo, acceptVpcInfo, createdAt, updatedAt, description);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RejectVpcPeeringResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    requestVpcInfo: ").append(toIndentedString(requestVpcInfo)).append("\n");
        sb.append("    acceptVpcInfo: ").append(toIndentedString(acceptVpcInfo)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
