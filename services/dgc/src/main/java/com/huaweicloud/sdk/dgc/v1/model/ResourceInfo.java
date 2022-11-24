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
    @JsonProperty(value = "name")

    private String name;

    /**
     * Gets or Sets type
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

        private static final Map<String, TypeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, TypeEnum> createStaticFields() {
            Map<String, TypeEnum> map = new HashMap<>();
            map.put("archive", ARCHIVE);
            map.put("file", FILE);
            map.put("jar", JAR);
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
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new TypeEnum(value);
            }
            return result;
        }

        public static TypeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            TypeEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
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

    public ResourceInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
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
     * Get type
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
     * Get dependFiles
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
     * Get desc
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResourceInfo resourceInfo = (ResourceInfo) o;
        return Objects.equals(this.name, resourceInfo.name) && Objects.equals(this.type, resourceInfo.type)
            && Objects.equals(this.location, resourceInfo.location)
            && Objects.equals(this.dependFiles, resourceInfo.dependFiles)
            && Objects.equals(this.desc, resourceInfo.desc) && Objects.equals(this.directory, resourceInfo.directory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, type, location, dependFiles, desc, directory);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ResourceInfo {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    location: ").append(toIndentedString(location)).append("\n");
        sb.append("    dependFiles: ").append(toIndentedString(dependFiles)).append("\n");
        sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
        sb.append("    directory: ").append(toIndentedString(directory)).append("\n");
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
