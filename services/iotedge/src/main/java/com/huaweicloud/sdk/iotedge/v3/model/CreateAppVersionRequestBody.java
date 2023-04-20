package com.huaweicloud.sdk.iotedge.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.http.FormDataFilePart;
import com.huaweicloud.sdk.core.http.FormDataPart;
import com.huaweicloud.sdk.core.http.SdkFormDataBody;
import java.io.File;
import java.io.InputStream;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * CreateAppVersionRequestBody
 */
public class CreateAppVersionRequestBody implements SdkFormDataBody {


    
    @JsonProperty(value="chart",access=JsonProperty.Access.WRITE_ONLY)
    

    private FormDataFilePart chart;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="images")
    

    private String images;

    public CreateAppVersionRequestBody withChart(FormDataFilePart chart) {
        this.chart = chart;
        return this;
    }

    


    /**
     * chart包。当前仅支持tgz文件格式。
     * @return chart
     */
    public FormDataFilePart getChart() {
        return chart;
    }

    public void setChart(FormDataFilePart chart) {
        this.chart = chart;
    }

    

    public CreateAppVersionRequestBody withImages(String images) {
        this.images = images;
        return this;
    }

    


    /**
     * 应用包含的镜像列表
     * @return images
     */
    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    
    
    public CreateAppVersionRequestBody withChart(InputStream inputStream, String fileName, String contentType) {
        this.chart = new FormDataFilePart(inputStream, fileName).withContentType(contentType);
        return this;
    }

    public CreateAppVersionRequestBody withChart(InputStream inputStream, String fileName) {
        this.chart = new FormDataFilePart(inputStream, fileName);
        return this;
    }

    public CreateAppVersionRequestBody withChart(InputStream inputStream, String fileName,
        Map<String, String> headers) {
        this.chart = new FormDataFilePart(inputStream, fileName).withHeaders(headers);
        return this;
    }
    

    @Override
    public Map<String, FormDataPart<?>> buildFormData() {
        return new LinkedHashMap<String, FormDataPart<?>>() {
            private static final long serialVersionUID = 1L;
            {
                put("chart", chart);
                if (images != null) {
                    put("images", new FormDataPart<>(images));
                }
            }
        };
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateAppVersionRequestBody createAppVersionRequestBody = (CreateAppVersionRequestBody) o;
        return Objects.equals(this.chart, createAppVersionRequestBody.chart) &&
            Objects.equals(this.images, createAppVersionRequestBody.images);
    }
    @Override
    public int hashCode() {
        return Objects.hash(chart, images);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAppVersionRequestBody {\n");
        sb.append("    chart: ").append(toIndentedString("[resource:will-not-print]")).append("\n");
        sb.append("    images: ").append(toIndentedString(images)).append("\n");
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

