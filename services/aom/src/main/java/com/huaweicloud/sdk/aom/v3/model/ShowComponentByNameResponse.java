package com.huaweicloud.sdk.aom.v3.model;





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
public class ShowComponentByNameResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="id")
    
    
    private String id;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="aom_id")
    
    
    private String aomId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_id")
    
    
    private String appId;

    public ShowComponentByNameResponse withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 组件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    

    public ShowComponentByNameResponse withId(String id) {
        this.id = id;
        return this;
    }

    


    /**
     * 组件id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    

    public ShowComponentByNameResponse withAomId(String aomId) {
        this.aomId = aomId;
        return this;
    }

    


    /**
     * aomId
     * @return aomId
     */
    public String getAomId() {
        return aomId;
    }

    public void setAomId(String aomId) {
        this.aomId = aomId;
    }

    

    public ShowComponentByNameResponse withAppId(String appId) {
        this.appId = appId;
        return this;
    }

    


    /**
     * 应用id
     * @return appId
     */
    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowComponentByNameResponse showComponentByNameResponse = (ShowComponentByNameResponse) o;
        return Objects.equals(this.name, showComponentByNameResponse.name) &&
            Objects.equals(this.id, showComponentByNameResponse.id) &&
            Objects.equals(this.aomId, showComponentByNameResponse.aomId) &&
            Objects.equals(this.appId, showComponentByNameResponse.appId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, id, aomId, appId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowComponentByNameResponse {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    aomId: ").append(toIndentedString(aomId)).append("\n");
        sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
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

