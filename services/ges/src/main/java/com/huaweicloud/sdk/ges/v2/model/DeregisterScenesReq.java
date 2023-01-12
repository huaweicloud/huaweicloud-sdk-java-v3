package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.DeregisterScenesReqScenes;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * DeregisterScenes请求体
 */
public class DeregisterScenesReq  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="scenes")
    
    
    private List<DeregisterScenesReqScenes> scenes = null;
    
    public DeregisterScenesReq withScenes(List<DeregisterScenesReqScenes> scenes) {
        this.scenes = scenes;
        return this;
    }

    
    public DeregisterScenesReq addScenesItem(DeregisterScenesReqScenes scenesItem) {
        if(this.scenes == null) {
            this.scenes = new ArrayList<>();
        }
        this.scenes.add(scenesItem);
        return this;
    }

    public DeregisterScenesReq withScenes(Consumer<List<DeregisterScenesReqScenes>> scenesSetter) {
        if(this.scenes == null) {
            this.scenes = new ArrayList<>();
        }
        scenesSetter.accept(this.scenes);
        return this;
    }

    /**
     * 要取消订阅的具体场景列表。
     * @return scenes
     */
    public List<DeregisterScenesReqScenes> getScenes() {
        return scenes;
    }

    public void setScenes(List<DeregisterScenesReqScenes> scenes) {
        this.scenes = scenes;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeregisterScenesReq deregisterScenesReq = (DeregisterScenesReq) o;
        return Objects.equals(this.scenes, deregisterScenesReq.scenes);
    }
    @Override
    public int hashCode() {
        return Objects.hash(scenes);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeregisterScenesReq {\n");
        sb.append("    scenes: ").append(toIndentedString(scenes)).append("\n");
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

