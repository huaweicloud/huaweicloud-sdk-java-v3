package com.huaweicloud.sdk.dgc.v1.model;

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
 * ResourceInfo
 */
public class ResourceInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    /**
     * 资源类型:   - archive: 压缩包   - file: 文件   - jar: jar文件   - pyFile：python文件
     */
    public static final class TypeEnum {

        /**
         * Enum ARCHIVE for value: "archive"
         */
        public static final TypeEnum ARCHIVE = new TypeEnum("archive");

        /**
         * Enum FILE for value: "file"
         */
        public static final TypeEnum FILE = new TypeEnum("file");

        /**
         * Enum JAR for value: "jar"
         */
        public static final TypeEnum JAR = new TypeEnum("jar");

        /**
         * Enum PYFILE for value: "pyFile"
         */
        public static final TypeEnum PYFILE = new TypeEnum("pyFile");

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("archive", ARCHIVE);
            map.put("file", FILE);
            map.put("jar", JAR);
            map.put("pyFile", PYFILE);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        TypeEnum(String value) {
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
        public static TypeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new TypeEnum(value));
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof TypeEnum) {
                return this.value.equals(((TypeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private TypeEnum type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "location")

    private String location;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependFiles")

    private List<String> dependFiles = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desc")

    private String desc;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "directory")

    private String directory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dependPackages")

    private List<DependPackage> dependPackages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobRelation")

    private List<Relation> jobRelation = null;

    public ResourceInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 资源id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ResourceInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 资源名称，只能包含英文字母、数字、中文字符、下划线或中划线。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ResourceInfo withType(TypeEnum type) {
        this.type = type;
        return this;
    }

    /**
     * 资源类型:   - archive: 压缩包   - file: 文件   - jar: jar文件   - pyFile：python文件
     * @return type
     */
    public TypeEnum getType() {
        return type;
    }

    public void setType(TypeEnum type) {
        this.type = type;
    }

    public ResourceInfo withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * 资源文件所在OBS路径
     * @return location
     */
    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public ResourceInfo withDependFiles(List<String> dependFiles) {
        this.dependFiles = dependFiles;
        return this;
    }

    public ResourceInfo addDependFilesItem(String dependFilesItem) {
        if (this.dependFiles == null) {
            this.dependFiles = new ArrayList<>();
        }
        this.dependFiles.add(dependFilesItem);
        return this;
    }

    public ResourceInfo withDependFiles(Consumer<List<String>> dependFilesSetter) {
        if (this.dependFiles == null) {
            this.dependFiles = new ArrayList<>();
        }
        dependFilesSetter.accept(this.dependFiles);
        return this;
    }

    /**
     * 主Jar包所依赖的JAR包、properties文件
     * @return dependFiles
     */
    public List<String> getDependFiles() {
        return dependFiles;
    }

    public void setDependFiles(List<String> dependFiles) {
        this.dependFiles = dependFiles;
    }

    public ResourceInfo withDesc(String desc) {
        this.desc = desc;
        return this;
    }

    /**
     * 资源描述
     * @return desc
     */
    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public ResourceInfo withDirectory(String directory) {
        this.directory = directory;
        return this;
    }

    /**
     * 资源所在目录
     * @return directory
     */
    public String getDirectory() {
        return directory;
    }

    public void setDirectory(String directory) {
        this.directory = directory;
    }

    public ResourceInfo withDependPackages(List<DependPackage> dependPackages) {
        this.dependPackages = dependPackages;
        return this;
    }

    public ResourceInfo addDependPackagesItem(DependPackage dependPackagesItem) {
        if (this.dependPackages == null) {
            this.dependPackages = new ArrayList<>();
        }
        this.dependPackages.add(dependPackagesItem);
        return this;
    }

    public ResourceInfo withDependPackages(Consumer<List<DependPackage>> dependPackagesSetter) {
        if (this.dependPackages == null) {
            this.dependPackages = new ArrayList<>();
        }
        dependPackagesSetter.accept(this.dependPackages);
        return this;
    }

    /**
     * 主Jar包所依赖的JAR包、properties文件。同时存在dependFiles和dependPackages时，优先解析该字段。
     * @return dependPackages
     */
    public List<DependPackage> getDependPackages() {
        return dependPackages;
    }

    public void setDependPackages(List<DependPackage> dependPackages) {
        this.dependPackages = dependPackages;
    }

    public ResourceInfo withJobRelation(List<Relation> jobRelation) {
        this.jobRelation = jobRelation;
        return this;
    }

    public ResourceInfo addJobRelationItem(Relation jobRelationItem) {
        if (this.jobRelation == null) {
            this.jobRelation = new ArrayList<>();
        }
        this.jobRelation.add(jobRelationItem);
        return this;
    }

    public ResourceInfo withJobRelation(Consumer<List<Relation>> jobRelationSetter) {
        if (this.jobRelation == null) {
            this.jobRelation = new ArrayList<>();
        }
        jobRelationSetter.accept(this.jobRelation);
        return this;
    }

    /**
     * 通过jar包名称查询相关的job
     * @return jobRelation
     */
    public List<Relation> getJobRelation() {
        return jobRelation;
    }

    public void setJobRelation(List<Relation> jobRelation) {
        this.jobRelation = jobRelation;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ResourceInfo that = (ResourceInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.location, that.location)
            && Objects.equals(this.dependFiles, that.dependFiles) && Objects.equals(this.desc, that.desc)
            && Objects.equals(this.directory, that.directory)
            && Objects.equals(this.dependPackages, that.dependPackages)
            && Objects.equals(this.jobRelation, that.jobRelation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type, location, dependFiles, desc, directory, dependPackages, jobRelation);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    dependFiles: ").append(toIndentedString(dependFiles)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
        sb.append("    dependPackages: ").append(toIndentedString(dependPackages)).append("\n");
        sb.append("    jobRelation: ").append(toIndentedString(jobRelation)).append("\n");
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
