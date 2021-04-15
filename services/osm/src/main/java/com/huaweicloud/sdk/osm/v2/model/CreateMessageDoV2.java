package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateMessageDoV2
 */
public class CreateMessageDoV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="content")
    
    private String content;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="is_authorized")
    
    private Integer isAuthorized;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authorization_content")
    
    private String authorizationContent;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accessory_ids")
    
    private List<String> accessoryIds = null;
    
    public CreateMessageDoV2 withContent(String content) {
        this.content = content;
        return this;
    }

    


    /**
     * 留言内容
     * @return content
     */
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    

    public CreateMessageDoV2 withIsAuthorized(Integer isAuthorized) {
        this.isAuthorized = isAuthorized;
        return this;
    }

    


    /**
     * 是否授权
     * minimum: 0
     * maximum: 1
     * @return isAuthorized
     */
    public Integer getIsAuthorized() {
        return isAuthorized;
    }

    public void setIsAuthorized(Integer isAuthorized) {
        this.isAuthorized = isAuthorized;
    }

    

    public CreateMessageDoV2 withAuthorizationContent(String authorizationContent) {
        this.authorizationContent = authorizationContent;
        return this;
    }

    


    /**
     * 机密信息
     * @return authorizationContent
     */
    public String getAuthorizationContent() {
        return authorizationContent;
    }

    public void setAuthorizationContent(String authorizationContent) {
        this.authorizationContent = authorizationContent;
    }

    

    public CreateMessageDoV2 withAccessoryIds(List<String> accessoryIds) {
        this.accessoryIds = accessoryIds;
        return this;
    }

    
    public CreateMessageDoV2 addAccessoryIdsItem(String accessoryIdsItem) {
        if(this.accessoryIds == null) {
            this.accessoryIds = new ArrayList<>();
        }
        this.accessoryIds.add(accessoryIdsItem);
        return this;
    }

    public CreateMessageDoV2 withAccessoryIds(Consumer<List<String>> accessoryIdsSetter) {
        if(this.accessoryIds == null) {
            this.accessoryIds = new ArrayList<>();
        }
        accessoryIdsSetter.accept(this.accessoryIds);
        return this;
    }

    /**
     * 附件id
     * @return accessoryIds
     */
    public List<String> getAccessoryIds() {
        return accessoryIds;
    }

    public void setAccessoryIds(List<String> accessoryIds) {
        this.accessoryIds = accessoryIds;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMessageDoV2 createMessageDoV2 = (CreateMessageDoV2) o;
        return Objects.equals(this.content, createMessageDoV2.content) &&
            Objects.equals(this.isAuthorized, createMessageDoV2.isAuthorized) &&
            Objects.equals(this.authorizationContent, createMessageDoV2.authorizationContent) &&
            Objects.equals(this.accessoryIds, createMessageDoV2.accessoryIds);
    }
    @Override
    public int hashCode() {
        return Objects.hash(content, isAuthorized, authorizationContent, accessoryIds);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMessageDoV2 {\n");
        sb.append("    content: ").append(toIndentedString(content)).append("\n");
        sb.append("    isAuthorized: ").append(toIndentedString(isAuthorized)).append("\n");
        sb.append("    authorizationContent: ").append(toIndentedString(authorizationContent)).append("\n");
        sb.append("    accessoryIds: ").append(toIndentedString(accessoryIds)).append("\n");
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

