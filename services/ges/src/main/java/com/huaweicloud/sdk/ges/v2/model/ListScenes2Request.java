package com.huaweicloud.sdk.ges.v2.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListScenes2Request  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scene_name")
    

    private String sceneName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="application_name")
    

    private String applicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="graph_id")
    

    private String graphId;

    public ListScenes2Request withSceneName(String sceneName) {
        this.sceneName = sceneName;
        return this;
    }

    


    /**
     * 场景名称。 当有且只有scene_name有值时，返回对应scene_name下的所有application详情。 当有且只有scene_name、application_name有值时，返回与application_name对应的application详情。 当scene_name、application_name、graph_id均无值时,返回所有SceneApplication
     * @return sceneName
     */
    public String getSceneName() {
        return sceneName;
    }

    public void setSceneName(String sceneName) {
        this.sceneName = sceneName;
    }

    

    public ListScenes2Request withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    


    /**
     * 应用程序名字。 当有且只有scene_name、application_name有值时，返回与application_name对应的application详情。 当scene_name、application_name、graph_id均无值时,返回所有SceneApplication。
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    

    public ListScenes2Request withGraphId(String graphId) {
        this.graphId = graphId;
        return this;
    }

    


    /**
     * 图ID。 当有且只有graph_id有值时，返回对应图id下所订阅的application详情。 当scene_name、application_name、graph_id均无值时,返回所有SceneApplication。
     * @return graphId
     */
    public String getGraphId() {
        return graphId;
    }

    public void setGraphId(String graphId) {
        this.graphId = graphId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListScenes2Request listScenes2Request = (ListScenes2Request) o;
        return Objects.equals(this.sceneName, listScenes2Request.sceneName) &&
            Objects.equals(this.applicationName, listScenes2Request.applicationName) &&
            Objects.equals(this.graphId, listScenes2Request.graphId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(sceneName, applicationName, graphId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListScenes2Request {\n");
        sb.append("    sceneName: ").append(toIndentedString(sceneName)).append("\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    graphId: ").append(toIndentedString(graphId)).append("\n");
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

