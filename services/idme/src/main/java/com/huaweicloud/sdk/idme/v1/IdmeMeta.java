package com.huaweicloud.sdk.idme.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.idme.v1.model.CreateXdmApplicationRequest;
import com.huaweicloud.sdk.idme.v1.model.CreateXdmApplicationRequestBody;
import com.huaweicloud.sdk.idme.v1.model.CreateXdmApplicationResponse;
import com.huaweicloud.sdk.idme.v1.model.DeleteCloudServiceRequest;
import com.huaweicloud.sdk.idme.v1.model.DeleteCloudServiceResponse;
import com.huaweicloud.sdk.idme.v1.model.DeleteXdmApplicationRequest;
import com.huaweicloud.sdk.idme.v1.model.DeleteXdmApplicationResponse;
import com.huaweicloud.sdk.idme.v1.model.DeployApplicationRequest;
import com.huaweicloud.sdk.idme.v1.model.DeployApplicationRequestBody;
import com.huaweicloud.sdk.idme.v1.model.DeployApplicationResponse;
import com.huaweicloud.sdk.idme.v1.model.ListAppsRequest;
import com.huaweicloud.sdk.idme.v1.model.ListAppsResponse;
import com.huaweicloud.sdk.idme.v1.model.ListEnvsRequest;
import com.huaweicloud.sdk.idme.v1.model.ListEnvsResponse;
import com.huaweicloud.sdk.idme.v1.model.ModifyApplicationRequest;
import com.huaweicloud.sdk.idme.v1.model.ModifyApplicationRequestBody;
import com.huaweicloud.sdk.idme.v1.model.ModifyApplicationResponse;
import com.huaweicloud.sdk.idme.v1.model.SubscribeCloudServiceRequest;
import com.huaweicloud.sdk.idme.v1.model.SubscribeCloudServiceResponse;
import com.huaweicloud.sdk.idme.v1.model.UninstallRequest;
import com.huaweicloud.sdk.idme.v1.model.UninstallResponse;

@SuppressWarnings("unchecked")
public class IdmeMeta {

    public static final HttpRequestDef<CreateXdmApplicationRequest, CreateXdmApplicationResponse> createXdmApplication =
        genForCreateXdmApplication();

    private static HttpRequestDef<CreateXdmApplicationRequest, CreateXdmApplicationResponse> genForCreateXdmApplication() {
        // basic
        HttpRequestDef.Builder<CreateXdmApplicationRequest, CreateXdmApplicationResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, CreateXdmApplicationRequest.class, CreateXdmApplicationResponse.class)
            .withName("CreateXdmApplication")
            .withUri("/v1/{project_id}/apps")
            .withContentType("application/json");

        // requests
        builder.<CreateXdmApplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateXdmApplicationRequestBody.class),
            f -> f.withMarshaller(CreateXdmApplicationRequest::getBody, CreateXdmApplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteCloudServiceRequest, DeleteCloudServiceResponse> deleteCloudService =
        genForDeleteCloudService();

    private static HttpRequestDef<DeleteCloudServiceRequest, DeleteCloudServiceResponse> genForDeleteCloudService() {
        // basic
        HttpRequestDef.Builder<DeleteCloudServiceRequest, DeleteCloudServiceResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteCloudServiceRequest.class, DeleteCloudServiceResponse.class)
                .withName("DeleteCloudService")
                .withUri("/v1/{project_id}/{service_type}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudServiceRequest::getServiceType,
                DeleteCloudServiceRequest::setServiceType));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteCloudServiceRequest::getInstanceId, DeleteCloudServiceRequest::setInstanceId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteXdmApplicationRequest, DeleteXdmApplicationResponse> deleteXdmApplication =
        genForDeleteXdmApplication();

    private static HttpRequestDef<DeleteXdmApplicationRequest, DeleteXdmApplicationResponse> genForDeleteXdmApplication() {
        // basic
        HttpRequestDef.Builder<DeleteXdmApplicationRequest, DeleteXdmApplicationResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteXdmApplicationRequest.class, DeleteXdmApplicationResponse.class)
            .withName("DeleteXdmApplication")
            .withUri("/v1/{project_id}/apps/{app_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteXdmApplicationRequest::getAppId, DeleteXdmApplicationRequest::setAppId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeployApplicationRequest, DeployApplicationResponse> deployApplication =
        genForDeployApplication();

    private static HttpRequestDef<DeployApplicationRequest, DeployApplicationResponse> genForDeployApplication() {
        // basic
        HttpRequestDef.Builder<DeployApplicationRequest, DeployApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeployApplicationRequest.class, DeployApplicationResponse.class)
                .withName("DeployApplication")
                .withUri("/v1/{project_id}/envs/{env_id}/apps/{app_id}/deploy")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("env_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployApplicationRequest::getEnvId, DeployApplicationRequest::setEnvId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployApplicationRequest::getAppId, DeployApplicationRequest::setAppId));
        builder.<DeployApplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeployApplicationRequestBody.class),
            f -> f.withMarshaller(DeployApplicationRequest::getBody, DeployApplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForListApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForListApps() {
        // basic
        HttpRequestDef.Builder<ListAppsRequest, ListAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsRequest.class, ListAppsResponse.class)
                .withName("ListApps")
                .withUri("/v1/{project_id}/apps")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppsRequest::getPageNum, ListAppsRequest::setPageNum));
        builder.<Long>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListAppsRequest::getPageSize, ListAppsRequest::setPageSize));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvsRequest, ListEnvsResponse> listEnvs = genForListEnvs();

    private static HttpRequestDef<ListEnvsRequest, ListEnvsResponse> genForListEnvs() {
        // basic
        HttpRequestDef.Builder<ListEnvsRequest, ListEnvsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnvsRequest.class, ListEnvsResponse.class)
                .withName("ListEnvs")
                .withUri("/v1/{project_id}/envs")
                .withContentType("application/json");

        // requests
        builder.<Long>withRequestField("page_num",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvsRequest::getPageNum, ListEnvsRequest::setPageNum));
        builder.<Long>withRequestField("page_size",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Long.class),
            f -> f.withMarshaller(ListEnvsRequest::getPageSize, ListEnvsRequest::setPageSize));
        builder.<String>withRequestField("env_types",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvsRequest::getEnvTypes, ListEnvsRequest::setEnvTypes));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyApplicationRequest, ModifyApplicationResponse> modifyApplication =
        genForModifyApplication();

    private static HttpRequestDef<ModifyApplicationRequest, ModifyApplicationResponse> genForModifyApplication() {
        // basic
        HttpRequestDef.Builder<ModifyApplicationRequest, ModifyApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ModifyApplicationRequest.class, ModifyApplicationResponse.class)
                .withName("ModifyApplication")
                .withUri("/v1/{project_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ModifyApplicationRequest::getAppId, ModifyApplicationRequest::setAppId));
        builder.<ModifyApplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyApplicationRequestBody.class),
            f -> f.withMarshaller(ModifyApplicationRequest::getBody, ModifyApplicationRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SubscribeCloudServiceRequest, SubscribeCloudServiceResponse> subscribeCloudService =
        genForSubscribeCloudService();

    private static HttpRequestDef<SubscribeCloudServiceRequest, SubscribeCloudServiceResponse> genForSubscribeCloudService() {
        // basic
        HttpRequestDef.Builder<SubscribeCloudServiceRequest, SubscribeCloudServiceResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, SubscribeCloudServiceRequest.class, SubscribeCloudServiceResponse.class)
            .withName("SubscribeCloudService")
            .withUri("/v1/{project_id}/{service_type}/instances")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("service_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(SubscribeCloudServiceRequest::getServiceType,
                SubscribeCloudServiceRequest::setServiceType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UninstallRequest, UninstallResponse> uninstall = genForUninstall();

    private static HttpRequestDef<UninstallRequest, UninstallResponse> genForUninstall() {
        // basic
        HttpRequestDef.Builder<UninstallRequest, UninstallResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, UninstallRequest.class, UninstallResponse.class)
                .withName("Uninstall")
                .withUri("/v1/{project_id}/envs/{env_id}/apps/{app_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("env_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UninstallRequest::getEnvId, UninstallRequest::setEnvId));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UninstallRequest::getAppId, UninstallRequest::setAppId));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UninstallResponse::getBody, UninstallResponse::setBody));

        return builder.build();
    }

}
