package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.roma.v2.model.UniversalDetail;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 集成应用维度统计信息
 */
public class RomaAppDetail  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_app_id")
    
    private String romaAppId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="roma_app_name")
    
    private String romaAppName;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="list")
    
    private List<UniversalDetail> list = null;
    
    public RomaAppDetail withRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
        return this;
    }

    


    /**
     * 集成应用编号
     * @return romaAppId
     */
    public String getRomaAppId() {
        return romaAppId;
    }

    public void setRomaAppId(String romaAppId) {
        this.romaAppId = romaAppId;
    }

    public RomaAppDetail withRomaAppName(String romaAppName) {
        this.romaAppName = romaAppName;
        return this;
    }

    


    /**
     * 集成应用名称
     * @return romaAppName
     */
    public String getRomaAppName() {
        return romaAppName;
    }

    public void setRomaAppName(String romaAppName) {
        this.romaAppName = romaAppName;
    }

    public RomaAppDetail withList(List<UniversalDetail> list) {
        this.list = list;
        return this;
    }

    
    public RomaAppDetail addListItem(UniversalDetail listItem) {
        if (this.list == null) {
            this.list = new ArrayList<>();
        }
        this.list.add(listItem);
        return this;
    }

    public RomaAppDetail withList(Consumer<List<UniversalDetail>> listSetter) {
        if(this.list == null ){
            this.list = new ArrayList<>();
        }
        listSetter.accept(this.list);
        return this;
    }

    /**
     * 集成应用维度下不同周期指标列表
     * @return list
     */
    public List<UniversalDetail> getList() {
        return list;
    }

    public void setList(List<UniversalDetail> list) {
        this.list = list;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RomaAppDetail romaAppDetail = (RomaAppDetail) o;
        return Objects.equals(this.romaAppId, romaAppDetail.romaAppId) &&
            Objects.equals(this.romaAppName, romaAppDetail.romaAppName) &&
            Objects.equals(this.list, romaAppDetail.list);
    }
    @Override
    public int hashCode() {
        return Objects.hash(romaAppId, romaAppName, list);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RomaAppDetail {\n");
        sb.append("    romaAppId: ").append(toIndentedString(romaAppId)).append("\n");
        sb.append("    romaAppName: ").append(toIndentedString(romaAppName)).append("\n");
        sb.append("    list: ").append(toIndentedString(list)).append("\n");
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

