package com.huaweicloud.sdk.idme.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.idme.v1.model.CreateXdmApplicationRequest;
import com.huaweicloud.sdk.idme.v1.model.CreateXdmApplicationRequestBody;
import com.huaweicloud.sdk.idme.v1.model.CreateXdmApplicationResponse;
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
import com.huaweicloud.sdk.idme.v1.model.UninstallRequest;
import com.huaweicloud.sdk.idme.v1.model.UninstallResponse;

@SuppressWarnings("unchecked")
public class IdmeMeta {

    public static final HttpRequestDef<CreateXdmApplicationRequest, CreateXdmApplicationResponse> createXdmApplication =
        genForcreateXdmApplication();

    private static HttpRequestDef<CreateXdmApplicationRequest, CreateXdmApplicationResponse> genForcreateXdmApplication() {
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
            f -> f.withMarshaller(CreateXdmApplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteXdmApplicationRequest, DeleteXdmApplicationResponse> deleteXdmApplication =
        genFordeleteXdmApplication();

    private static HttpRequestDef<DeleteXdmApplicationRequest, DeleteXdmApplicationResponse> genFordeleteXdmApplication() {
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
            f -> f.withMarshaller(DeleteXdmApplicationRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeployApplicationRequest, DeployApplicationResponse> deployApplication =
        genFordeployApplication();

    private static HttpRequestDef<DeployApplicationRequest, DeployApplicationResponse> genFordeployApplication() {
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
            f -> f.withMarshaller(DeployApplicationRequest::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeployApplicationRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<DeployApplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(DeployApplicationRequestBody.class),
            f -> f.withMarshaller(DeployApplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAppsRequest, ListAppsResponse> listApps = genForlistApps();

    private static HttpRequestDef<ListAppsRequest, ListAppsResponse> genForlistApps() {
        // basic
        HttpRequestDef.Builder<ListAppsRequest, ListAppsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAppsRequest.class, ListAppsResponse.class)
                .withName("ListApps")
                .withUri("/v1/{project_id}/apps")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvsRequest, ListEnvsResponse> listEnvs = genForlistEnvs();

    private static HttpRequestDef<ListEnvsRequest, ListEnvsResponse> genForlistEnvs() {
        // basic
        HttpRequestDef.Builder<ListEnvsRequest, ListEnvsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnvsRequest.class, ListEnvsResponse.class)
                .withName("ListEnvs")
                .withUri("/v1/{project_id}/envs")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ModifyApplicationRequest, ModifyApplicationResponse> modifyApplication =
        genFormodifyApplication();

    private static HttpRequestDef<ModifyApplicationRequest, ModifyApplicationResponse> genFormodifyApplication() {
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
            f -> f.withMarshaller(ModifyApplicationRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));
        builder.<ModifyApplicationRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ModifyApplicationRequestBody.class),
            f -> f.withMarshaller(ModifyApplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UninstallRequest, UninstallResponse> uninstall = genForuninstall();

    private static HttpRequestDef<UninstallRequest, UninstallResponse> genForuninstall() {
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
            f -> f.withMarshaller(UninstallRequest::getEnvId, (req, v) -> {
                req.setEnvId(v);
            }));
        builder.<String>withRequestField("app_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UninstallRequest::getAppId, (req, v) -> {
                req.setAppId(v);
            }));

        // response
        builder.<String>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            String.class,
            f -> f.withMarshaller(UninstallResponse::getBody, (response, data) -> {
                response.setBody(data);
            }));

        return builder.build();
    }

}
