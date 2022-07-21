package com.huaweicloud.sdk.cloudide.v2;

import com.huaweicloud.sdk.cloudide.v2.model.*;
import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;

@SuppressWarnings("unchecked")
public class CloudIDEMeta {

    public static final HttpRequestDef<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse> createExtensionAuthorization =
        genForcreateExtensionAuthorization();

    private static HttpRequestDef<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse> genForcreateExtensionAuthorization() {
        // basic
        HttpRequestDef.Builder<CreateExtensionAuthorizationRequest, CreateExtensionAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateExtensionAuthorizationRequest.class,
                    CreateExtensionAuthorizationResponse.class)
                .withName("CreateExtensionAuthorization")
                .withUri("/v2/extension/authorization/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateExtensionAuthorizationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<ExtensionAuthorization>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ExtensionAuthorization.class),
            f -> f.withMarshaller(CreateExtensionAuthorizationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectTemplatesRequest, ListProjectTemplatesResponse> listProjectTemplates =
        genForlistProjectTemplates();

    private static HttpRequestDef<ListProjectTemplatesRequest, ListProjectTemplatesResponse> genForlistProjectTemplates() {
        // basic
        HttpRequestDef.Builder<ListProjectTemplatesRequest, ListProjectTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListProjectTemplatesRequest.class, ListProjectTemplatesResponse.class)
            .withName("ListProjectTemplates")
            .withUri("/v2/templates")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("arch",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTemplatesRequest::getArch, (req, v) -> {
                req.setArch(v);
            }));
        builder.<String>withRequestField("stack_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectTemplatesRequest::getStackId, (req, v) -> {
                req.setStackId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListStacksRequest, ListStacksResponse> listStacks = genForlistStacks();

    private static HttpRequestDef<ListStacksRequest, ListStacksResponse> genForlistStacks() {
        // basic
        HttpRequestDef.Builder<ListStacksRequest, ListStacksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListStacksRequest.class, ListStacksResponse.class)
                .withName("ListStacks")
                .withUri("/v2/stacks/tag")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("tags",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListStacksRequest::getTags, (req, v) -> {
                req.setTags(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAccountStatusRequest, ShowAccountStatusResponse> showAccountStatus =
        genForshowAccountStatus();

    private static HttpRequestDef<ShowAccountStatusRequest, ShowAccountStatusResponse> genForshowAccountStatus() {
        // basic
        HttpRequestDef.Builder<ShowAccountStatusRequest, ShowAccountStatusResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowAccountStatusRequest.class, ShowAccountStatusResponse.class)
                .withName("ShowAccountStatus")
                .withUri("/v2/permission/account/status")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse> showExtensionAuthorization =
        genForshowExtensionAuthorization();

    private static HttpRequestDef<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse> genForshowExtensionAuthorization() {
        // basic
        HttpRequestDef.Builder<ShowExtensionAuthorizationRequest, ShowExtensionAuthorizationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowExtensionAuthorizationRequest.class,
                    ShowExtensionAuthorizationResponse.class)
                .withName("ShowExtensionAuthorization")
                .withUri("/v2/extension/authorization")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("extension_version",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtensionAuthorizationRequest::getExtensionVersion, (req, v) -> {
                req.setExtensionVersion(v);
            }));
        builder.<String>withRequestField("identifier",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtensionAuthorizationRequest::getIdentifier, (req, v) -> {
                req.setIdentifier(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowExtensionAuthorizationRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowPriceRequest, ShowPriceResponse> showPrice = genForshowPrice();

    private static HttpRequestDef<ShowPriceRequest, ShowPriceResponse> genForshowPrice() {
        // basic
        HttpRequestDef.Builder<ShowPriceRequest, ShowPriceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowPriceRequest.class, ShowPriceResponse.class)
                .withName("ShowPrice")
                .withUri("/v2/stacks/price")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UploadExtensionFileRequest, UploadExtensionFileResponse> uploadExtensionFile =
        genForuploadExtensionFile();

    private static HttpRequestDef<UploadExtensionFileRequest, UploadExtensionFileResponse> genForuploadExtensionFile() {
        // basic
        HttpRequestDef.Builder<UploadExtensionFileRequest, UploadExtensionFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UploadExtensionFileRequest.class, UploadExtensionFileResponse.class)
                .withName("UploadExtensionFile")
                .withUri("/v1/marketplace/file/plugin")
                .withContentType("multipart/form-data");

        // requests
        builder.<String>withRequestField("official",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UploadExtensionFileRequest::getOfficial, (req, v) -> {
                req.setOfficial(v);
            }));
        builder.<UploadExtensionFileRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UploadExtensionFileRequestBody.class),
            f -> f.withMarshaller(UploadExtensionFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckInstanceAccessRequest, CheckInstanceAccessResponse> checkInstanceAccess =
        genForcheckInstanceAccess();

    private static HttpRequestDef<CheckInstanceAccessRequest, CheckInstanceAccessResponse> genForcheckInstanceAccess() {
        // basic
        HttpRequestDef.Builder<CheckInstanceAccessRequest, CheckInstanceAccessResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckInstanceAccessRequest.class, CheckInstanceAccessResponse.class)
                .withName("CheckInstanceAccess")
                .withUri("/v2/instances/{instance_id}/access")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckInstanceAccessRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckNameRequest, CheckNameResponse> checkName = genForcheckName();

    private static HttpRequestDef<CheckNameRequest, CheckNameResponse> genForcheckName() {
        // basic
        HttpRequestDef.Builder<CheckNameRequest, CheckNameResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, CheckNameRequest.class, CheckNameResponse.class)
                .withName("CheckName")
                .withUri("/v2/instances/duplicate")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("display_name",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CheckNameRequest::getDisplayName, (req, v) -> {
                req.setDisplayName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> createInstance =
        genForcreateInstance();

    private static HttpRequestDef<CreateInstanceRequest, CreateInstanceResponse> genForcreateInstance() {
        // basic
        HttpRequestDef.Builder<CreateInstanceRequest, CreateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceRequest.class, CreateInstanceResponse.class)
                .withName("CreateInstance")
                .withUri("/v2/{org_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("org_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getOrgId, (req, v) -> {
                req.setOrgId(v);
            }));
        builder.<InstanceParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceParam.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> createInstanceBy3rd =
        genForcreateInstanceBy3rd();

    private static HttpRequestDef<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> genForcreateInstanceBy3rd() {
        // basic
        HttpRequestDef.Builder<CreateInstanceBy3rdRequest, CreateInstanceBy3rdResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateInstanceBy3rdRequest.class, CreateInstanceBy3rdResponse.class)
                .withName("CreateInstanceBy3rd")
                .withUri("/v2/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceBy3rdRequest::getInstanceLabel, (req, v) -> {
                req.setInstanceLabel(v);
            }));
        builder.<InstanceEdgeParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceEdgeParam.class),
            f -> f.withMarshaller(CreateInstanceBy3rdRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
                .withName("DeleteInstance")
                .withUri("/v2/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstancesRequest, ListInstancesResponse> listInstances =
        genForlistInstances();

    private static HttpRequestDef<ListInstancesRequest, ListInstancesResponse> genForlistInstances() {
        // basic
        HttpRequestDef.Builder<ListInstancesRequest, ListInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListInstancesRequest.class, ListInstancesResponse.class)
                .withName("ListInstances")
                .withUri("/v2/instances")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<Boolean>withRequestField("is_temporary",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListInstancesRequest::getIsTemporary, (req, v) -> {
                req.setIsTemporary(v);
            }));
        builder.<String>withRequestField("label",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getLabel, (req, v) -> {
                req.setLabel(v);
            }));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            }));
        builder.<String>withRequestField("sort_dir",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSortDir, (req, v) -> {
                req.setSortDir(v);
            }));
        builder.<String>withRequestField("sort_key",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getSortKey, (req, v) -> {
                req.setSortKey(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOrgInstancesRequest, ListOrgInstancesResponse> listOrgInstances =
        genForlistOrgInstances();

    private static HttpRequestDef<ListOrgInstancesRequest, ListOrgInstancesResponse> genForlistOrgInstances() {
        // basic
        HttpRequestDef.Builder<ListOrgInstancesRequest, ListOrgInstancesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOrgInstancesRequest.class, ListOrgInstancesResponse.class)
                .withName("ListOrgInstances")
                .withUri("/v2/{org_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("org_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrgInstancesRequest::getOrgId, (req, v) -> {
                req.setOrgId(v);
            }));
        builder.<Boolean>withRequestField("is_temporary",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(ListOrgInstancesRequest::getIsTemporary, (req, v) -> {
                req.setIsTemporary(v);
            }));
        builder.<Long>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOrgInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Long>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListOrgInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("search",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOrgInstancesRequest::getSearch, (req, v) -> {
                req.setSearch(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> showInstance = genForshowInstance();

    private static HttpRequestDef<ShowInstanceRequest, ShowInstanceResponse> genForshowInstance() {
        // basic
        HttpRequestDef.Builder<ShowInstanceRequest, ShowInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowInstanceRequest.class, ShowInstanceResponse.class)
                .withName("ShowInstance")
                .withUri("/v2/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceStatusInfoRequest, ShowInstanceStatusInfoResponse> showInstanceStatusInfo =
        genForshowInstanceStatusInfo();

    private static HttpRequestDef<ShowInstanceStatusInfoRequest, ShowInstanceStatusInfoResponse> genForshowInstanceStatusInfo() {
        // basic
        HttpRequestDef.Builder<ShowInstanceStatusInfoRequest, ShowInstanceStatusInfoResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceStatusInfoRequest.class, ShowInstanceStatusInfoResponse.class)
            .withName("ShowInstanceStatusInfo")
            .withUri("/v2/instances/{instance_id}/status")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceStatusInfoRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StartInstanceRequest, StartInstanceResponse> startInstance =
        genForstartInstance();

    private static HttpRequestDef<StartInstanceRequest, StartInstanceResponse> genForstartInstance() {
        // basic
        HttpRequestDef.Builder<StartInstanceRequest, StartInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, StartInstanceRequest.class, StartInstanceResponse.class)
                .withName("StartInstance")
                .withUri("/v2/instances/{instance_id}/runtime")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StartInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<StartInstanceParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(StartInstanceParam.class),
            f -> f.withMarshaller(StartInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<StopInstanceRequest, StopInstanceResponse> stopInstance = genForstopInstance();

    private static HttpRequestDef<StopInstanceRequest, StopInstanceResponse> genForstopInstance() {
        // basic
        HttpRequestDef.Builder<StopInstanceRequest, StopInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, StopInstanceRequest.class, StopInstanceResponse.class)
                .withName("StopInstance")
                .withUri("/v2/instances/{instance_id}/runtime")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(StopInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> updateInstance =
        genForupdateInstance();

    private static HttpRequestDef<UpdateInstanceRequest, UpdateInstanceResponse> genForupdateInstance() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceRequest, UpdateInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateInstanceRequest.class, UpdateInstanceResponse.class)
                .withName("UpdateInstance")
                .withUri("/v2/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<InstanceUpdateParam>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(InstanceUpdateParam.class),
            f -> f.withMarshaller(UpdateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse> updateInstanceActivity =
        genForupdateInstanceActivity();

    private static HttpRequestDef<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse> genForupdateInstanceActivity() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceActivityRequest, UpdateInstanceActivityResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, UpdateInstanceActivityRequest.class, UpdateInstanceActivityResponse.class)
            .withName("UpdateInstanceActivity")
            .withUri("/v2/instances/{instance_id}/activity")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceActivityRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

}
