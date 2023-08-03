package com.huaweicloud.sdk.metastudio.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * PPT资产元数据信息。
 */
public class PPTAssetMeta {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_analysis")

    private Boolean autoAnalysis;

    /**
     * PPT解析状态。 * INITIALIZE：初始 * WAITING：等待 * CONVERTING：解析中 * FAILED：失败 * SUCCEEDED：成功 * CANCELED：取消
     */
    public static final class PptAnalysisStatusEnum {

        /**
         * Enum INITIALIZE for value: "INITIALIZE"
         */
        public static final PptAnalysisStatusEnum INITIALIZE = new PptAnalysisStatusEnum("INITIALIZE");

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final PptAnalysisStatusEnum WAITING = new PptAnalysisStatusEnum("WAITING");

        /**
         * Enum CONVERTING for value: "CONVERTING"
         */
        public static final PptAnalysisStatusEnum CONVERTING = new PptAnalysisStatusEnum("CONVERTING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final PptAnalysisStatusEnum FAILED = new PptAnalysisStatusEnum("FAILED");

        /**
         * Enum SUCCEEDED for value: "SUCCEEDED"
         */
        public static final PptAnalysisStatusEnum SUCCEEDED = new PptAnalysisStatusEnum("SUCCEEDED");

        /**
         * Enum CANCELED for value: "CANCELED"
         */
        public static final PptAnalysisStatusEnum CANCELED = new PptAnalysisStatusEnum("CANCELED");

        private static final Map<String, PptAnalysisStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, PptAnalysisStatusEnum> createStaticFields() {
            Map<String, PptAnalysisStatusEnum> map = new HashMap<>();
            map.put("INITIALIZE", INITIALIZE);
            map.put("WAITING", WAITING);
            map.put("CONVERTING", CONVERTING);
            map.put("FAILED", FAILED);
            map.put("SUCCEEDED", SUCCEEDED);
            map.put("CANCELED", CANCELED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        PptAnalysisStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static PptAnalysisStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new PptAnalysisStatusEnum(value));
        }

        public static PptAnalysisStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof PptAnalysisStatusEnum) {
                return this.value.equals(((PptAnalysisStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ppt_analysis_status")

    private PptAnalysisStatusEnum pptAnalysisStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_count")

    private Integer pageCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pages")

    private List<PPTPageInfo> pages = null;

    public PPTAssetMeta withAutoAnalysis(Boolean autoAnalysis) {
        this.autoAnalysis = autoAnalysis;
        return this;
    }

    /**
     * PPT是否需要自动解析。
     * @return autoAnalysis
     */
    public Boolean getAutoAnalysis() {
        return autoAnalysis;
    }

    public void setAutoAnalysis(Boolean autoAnalysis) {
        this.autoAnalysis = autoAnalysis;
    }

    public PPTAssetMeta withPptAnalysisStatus(PptAnalysisStatusEnum pptAnalysisStatus) {
        this.pptAnalysisStatus = pptAnalysisStatus;
        return this;
    }

    /**
     * PPT解析状态。 * INITIALIZE：初始 * WAITING：等待 * CONVERTING：解析中 * FAILED：失败 * SUCCEEDED：成功 * CANCELED：取消
     * @return pptAnalysisStatus
     */
    public PptAnalysisStatusEnum getPptAnalysisStatus() {
        return pptAnalysisStatus;
    }

    public void setPptAnalysisStatus(PptAnalysisStatusEnum pptAnalysisStatus) {
        this.pptAnalysisStatus = pptAnalysisStatus;
    }

    public PPTAssetMeta withPageCount(Integer pageCount) {
        this.pageCount = pageCount;
        return this;
    }

    /**
     * PPT页面总数。
     * minimum: 0
     * maximum: 256
     * @return pageCount
     */
    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public PPTAssetMeta withPages(List<PPTPageInfo> pages) {
        this.pages = pages;
        return this;
    }

    public PPTAssetMeta addPagesItem(PPTPageInfo pagesItem) {
        if (this.pages == null) {
            this.pages = new ArrayList<>();
        }
        this.pages.add(pagesItem);
        return this;
    }

    public PPTAssetMeta withPages(Consumer<List<PPTPageInfo>> pagesSetter) {
        if (this.pages == null) {
            this.pages = new ArrayList<>();
        }
        pagesSetter.accept(this.pages);
        return this;
    }

    /**
     * PPT页面图片。
     * @return pages
     */
    public List<PPTPageInfo> getPages() {
        return pages;
    }

    public void setPages(List<PPTPageInfo> pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PPTAssetMeta that = (PPTAssetMeta) obj;
        return Objects.equals(this.autoAnalysis, that.autoAnalysis)
            && Objects.equals(this.pptAnalysisStatus, that.pptAnalysisStatus)
            && Objects.equals(this.pageCount, that.pageCount) && Objects.equals(this.pages, that.pages);
    }

    @Override
    public int hashCode() {
        return Objects.hash(autoAnalysis, pptAnalysisStatus, pageCount, pages);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PPTAssetMeta {\n");
        sb.append("    autoAnalysis: ").append(toIndentedString(autoAnalysis)).append("\n");
        sb.append("    pptAnalysisStatus: ").append(toIndentedString(pptAnalysisStatus)).append("\n");
        sb.append("    pageCount: ").append(toIndentedString(pageCount)).append("\n");
        sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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
