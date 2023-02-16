package com.huaweicloud.sdk.ges.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.ges.v2.model.ShowMetadataRespGesMetadataLabels;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 存储metadata的消息信息的对象。
 */
public class ShowMetadataRespGesMetadata  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="labels")
    
    
    private List<ShowMetadataRespGesMetadataLabels> labels = null;
    
    public ShowMetadataRespGesMetadata withLabels(List<ShowMetadataRespGesMetadataLabels> labels) {
        this.labels = labels;
        return this;
    }

    
    public ShowMetadataRespGesMetadata addLabelsItem(ShowMetadataRespGesMetadataLabels labelsItem) {
        if(this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ShowMetadataRespGesMetadata withLabels(Consumer<List<ShowMetadataRespGesMetadataLabels>> labelsSetter) {
        if(this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * Label数据结构集合。
     * @return labels
     */
    public List<ShowMetadataRespGesMetadataLabels> getLabels() {
        return labels;
    }

    public void setLabels(List<ShowMetadataRespGesMetadataLabels> labels) {
        this.labels = labels;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowMetadataRespGesMetadata showMetadataRespGesMetadata = (ShowMetadataRespGesMetadata) o;
        return Objects.equals(this.labels, showMetadataRespGesMetadata.labels);
    }
    @Override
    public int hashCode() {
        return Objects.hash(labels);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMetadataRespGesMetadata {\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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

