package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDesired;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 修改设备影子预期数据结构体。
 */
public class UpdateDesireds  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="shadow")
    
    private List<UpdateDesired> shadow = null;
    
    public UpdateDesireds withShadow(List<UpdateDesired> shadow) {
        this.shadow = shadow;
        return this;
    }

    
    public UpdateDesireds addShadowItem(UpdateDesired shadowItem) {
        this.shadow.add(shadowItem);
        return this;
    }

    public UpdateDesireds withShadow(Consumer<List<UpdateDesired>> shadowSetter) {
        if(this.shadow == null ){
            this.shadow = new ArrayList<>();
        }
        shadowSetter.accept(this.shadow);
        return this;
    }

    /**
     * 设备影子期望值构体。
     * @return shadow
     */
    public List<UpdateDesired> getShadow() {
        return shadow;
    }

    public void setShadow(List<UpdateDesired> shadow) {
        this.shadow = shadow;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateDesireds updateDesireds = (UpdateDesireds) o;
        return Objects.equals(this.shadow, updateDesireds.shadow);
    }
    @Override
    public int hashCode() {
        return Objects.hash(shadow);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDesireds {\n");
        sb.append("    shadow: ").append(toIndentedString(shadow)).append("\n");
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

