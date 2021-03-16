package com.huaweicloud.sdk.oms.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 列表文件配置。
 */
public class ListFile  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="list_file_key")
    
    private String listFileKey;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="obs_bucket")
    
    private String obsBucket;

    public ListFile withListFileKey(String listFileKey) {
        this.listFileKey = listFileKey;
        return this;
    }

    


    /**
     * 对象列表文件或URL列表文件对象名。
     * @return listFileKey
     */
    public String getListFileKey() {
        return listFileKey;
    }

    public void setListFileKey(String listFileKey) {
        this.listFileKey = listFileKey;
    }

    

    public ListFile withObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
        return this;
    }

    


    /**
     * 存放对象列表文件的OBS桶名。  请确保与目的端桶处于同一区域，否则将导致任务创建失败。
     * @return obsBucket
     */
    public String getObsBucket() {
        return obsBucket;
    }

    public void setObsBucket(String obsBucket) {
        this.obsBucket = obsBucket;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListFile listFile = (ListFile) o;
        return Objects.equals(this.listFileKey, listFile.listFileKey) &&
            Objects.equals(this.obsBucket, listFile.obsBucket);
    }
    @Override
    public int hashCode() {
        return Objects.hash(listFileKey, obsBucket);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListFile {\n");
        sb.append("    listFileKey: ").append(toIndentedString(listFileKey)).append("\n");
        sb.append("    obsBucket: ").append(toIndentedString(obsBucket)).append("\n");
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

