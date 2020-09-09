package com.huaweicloud.sdk.vpc.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListSecurityGroupRulesRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="limit")
    
    private Integer limit;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="marker")
    
    private String marker;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    private List<String> id = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="security_group_id")
    
    private List<String> securityGroupId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="protocol")
    
    private List<String> protocol = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="description")
    
    private List<String> description = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="remote_group_id")
    
    private List<String> remoteGroupId = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="direction")
    
    private String direction;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="action")
    
    private String action;

    public ListSecurityGroupRulesRequest withLimit(Integer limit) {
        this.limit = limit;
        return this;
    }

    


    /**
     * Get limit
     * @return limit
     */
    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public ListSecurityGroupRulesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    


    /**
     * Get marker
     * @return marker
     */
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }

    public ListSecurityGroupRulesRequest withId(List<String> id) {
        this.id = id;
        return this;
    }

    
    public ListSecurityGroupRulesRequest addIdItem(String idItem) {
        if (this.id == null) {
            this.id = new ArrayList<>();
        }
        this.id.add(idItem);
        return this;
    }

    public ListSecurityGroupRulesRequest withId(Consumer<List<String>> idSetter) {
        if(this.id == null ){
            this.id = new ArrayList<>();
        }
        idSetter.accept(this.id);
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public List<String> getId() {
        return id;
    }

    public void setId(List<String> id) {
        this.id = id;
    }

    public ListSecurityGroupRulesRequest withSecurityGroupId(List<String> securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }

    
    public ListSecurityGroupRulesRequest addSecurityGroupIdItem(String securityGroupIdItem) {
        if (this.securityGroupId == null) {
            this.securityGroupId = new ArrayList<>();
        }
        this.securityGroupId.add(securityGroupIdItem);
        return this;
    }

    public ListSecurityGroupRulesRequest withSecurityGroupId(Consumer<List<String>> securityGroupIdSetter) {
        if(this.securityGroupId == null ){
            this.securityGroupId = new ArrayList<>();
        }
        securityGroupIdSetter.accept(this.securityGroupId);
        return this;
    }

    /**
     * Get securityGroupId
     * @return securityGroupId
     */
    public List<String> getSecurityGroupId() {
        return securityGroupId;
    }

    public void setSecurityGroupId(List<String> securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public ListSecurityGroupRulesRequest withProtocol(List<String> protocol) {
        this.protocol = protocol;
        return this;
    }

    
    public ListSecurityGroupRulesRequest addProtocolItem(String protocolItem) {
        if (this.protocol == null) {
            this.protocol = new ArrayList<>();
        }
        this.protocol.add(protocolItem);
        return this;
    }

    public ListSecurityGroupRulesRequest withProtocol(Consumer<List<String>> protocolSetter) {
        if(this.protocol == null ){
            this.protocol = new ArrayList<>();
        }
        protocolSetter.accept(this.protocol);
        return this;
    }

    /**
     * Get protocol
     * @return protocol
     */
    public List<String> getProtocol() {
        return protocol;
    }

    public void setProtocol(List<String> protocol) {
        this.protocol = protocol;
    }

    public ListSecurityGroupRulesRequest withDescription(List<String> description) {
        this.description = description;
        return this;
    }

    
    public ListSecurityGroupRulesRequest addDescriptionItem(String descriptionItem) {
        if (this.description == null) {
            this.description = new ArrayList<>();
        }
        this.description.add(descriptionItem);
        return this;
    }

    public ListSecurityGroupRulesRequest withDescription(Consumer<List<String>> descriptionSetter) {
        if(this.description == null ){
            this.description = new ArrayList<>();
        }
        descriptionSetter.accept(this.description);
        return this;
    }

    /**
     * Get description
     * @return description
     */
    public List<String> getDescription() {
        return description;
    }

    public void setDescription(List<String> description) {
        this.description = description;
    }

    public ListSecurityGroupRulesRequest withRemoteGroupId(List<String> remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
        return this;
    }

    
    public ListSecurityGroupRulesRequest addRemoteGroupIdItem(String remoteGroupIdItem) {
        if (this.remoteGroupId == null) {
            this.remoteGroupId = new ArrayList<>();
        }
        this.remoteGroupId.add(remoteGroupIdItem);
        return this;
    }

    public ListSecurityGroupRulesRequest withRemoteGroupId(Consumer<List<String>> remoteGroupIdSetter) {
        if(this.remoteGroupId == null ){
            this.remoteGroupId = new ArrayList<>();
        }
        remoteGroupIdSetter.accept(this.remoteGroupId);
        return this;
    }

    /**
     * Get remoteGroupId
     * @return remoteGroupId
     */
    public List<String> getRemoteGroupId() {
        return remoteGroupId;
    }

    public void setRemoteGroupId(List<String> remoteGroupId) {
        this.remoteGroupId = remoteGroupId;
    }

    public ListSecurityGroupRulesRequest withDirection(String direction) {
        this.direction = direction;
        return this;
    }

    


    /**
     * Get direction
     * @return direction
     */
    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public ListSecurityGroupRulesRequest withAction(String action) {
        this.action = action;
        return this;
    }

    


    /**
     * Get action
     * @return action
     */
    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListSecurityGroupRulesRequest listSecurityGroupRulesRequest = (ListSecurityGroupRulesRequest) o;
        return Objects.equals(this.limit, listSecurityGroupRulesRequest.limit) &&
            Objects.equals(this.marker, listSecurityGroupRulesRequest.marker) &&
            Objects.equals(this.id, listSecurityGroupRulesRequest.id) &&
            Objects.equals(this.securityGroupId, listSecurityGroupRulesRequest.securityGroupId) &&
            Objects.equals(this.protocol, listSecurityGroupRulesRequest.protocol) &&
            Objects.equals(this.description, listSecurityGroupRulesRequest.description) &&
            Objects.equals(this.remoteGroupId, listSecurityGroupRulesRequest.remoteGroupId) &&
            Objects.equals(this.direction, listSecurityGroupRulesRequest.direction) &&
            Objects.equals(this.action, listSecurityGroupRulesRequest.action);
    }
    @Override
    public int hashCode() {
        return Objects.hash(limit, marker, id, securityGroupId, protocol, description, remoteGroupId, direction, action);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListSecurityGroupRulesRequest {\n");
        sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
        sb.append("    marker: ").append(toIndentedString(marker)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    securityGroupId: ").append(toIndentedString(securityGroupId)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    remoteGroupId: ").append(toIndentedString(remoteGroupId)).append("\n");
        sb.append("    direction: ").append(toIndentedString(direction)).append("\n");
        sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

