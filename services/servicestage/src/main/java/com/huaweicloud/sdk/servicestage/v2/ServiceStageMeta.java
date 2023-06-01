package com.huaweicloud.sdk.servicestage.v2;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.servicestage.v2.model.*;

@SuppressWarnings("unchecked")
public class ServiceStageMeta {

    public static final HttpRequestDef<ChangeApplicationRequest, ChangeApplicationResponse> changeApplication =
        genForchangeApplication();

    private static HttpRequestDef<ChangeApplicationRequest, ChangeApplicationResponse> genForchangeApplication() {
        // basic
        HttpRequestDef.Builder<ChangeApplicationRequest, ChangeApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeApplicationRequest.class, ChangeApplicationResponse.class)
                .withName("ChangeApplication")
                .withUri("/v2/{project_id}/cas/applications/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeApplicationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<ApplicationModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplicationModify.class),
            f -> f.withMarshaller(ChangeApplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeApplicationConfigurationRequest, ChangeApplicationConfigurationResponse> changeApplicationConfiguration =
        genForchangeApplicationConfiguration();

    private static HttpRequestDef<ChangeApplicationConfigurationRequest, ChangeApplicationConfigurationResponse> genForchangeApplicationConfiguration() {
        // basic
        HttpRequestDef.Builder<ChangeApplicationConfigurationRequest, ChangeApplicationConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PUT,
                    ChangeApplicationConfigurationRequest.class,
                    ChangeApplicationConfigurationResponse.class)
                .withName("ChangeApplicationConfiguration")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeApplicationConfigurationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<ApplicationConfigModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplicationConfigModify.class),
            f -> f.withMarshaller(ChangeApplicationConfigurationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeComponentRequest, ChangeComponentResponse> changeComponent =
        genForchangeComponent();

    private static HttpRequestDef<ChangeComponentRequest, ChangeComponentResponse> genForchangeComponent() {
        // basic
        HttpRequestDef.Builder<ChangeComponentRequest, ChangeComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeComponentRequest.class, ChangeComponentResponse.class)
                .withName("ChangeComponent")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeComponentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeComponentRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<ComponentModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ComponentModify.class),
            f -> f.withMarshaller(ChangeComponentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeEnvironmentRequest, ChangeEnvironmentResponse> changeEnvironment =
        genForchangeEnvironment();

    private static HttpRequestDef<ChangeEnvironmentRequest, ChangeEnvironmentResponse> genForchangeEnvironment() {
        // basic
        HttpRequestDef.Builder<ChangeEnvironmentRequest, ChangeEnvironmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, ChangeEnvironmentRequest.class, ChangeEnvironmentResponse.class)
                .withName("ChangeEnvironment")
                .withUri("/v2/{project_id}/cas/environments/{environment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeEnvironmentRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));
        builder.<EnvironmentModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EnvironmentModify.class),
            f -> f.withMarshaller(ChangeEnvironmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeInstanceRequest, ChangeInstanceResponse> changeInstance =
        genForchangeInstance();

    private static HttpRequestDef<ChangeInstanceRequest, ChangeInstanceResponse> genForchangeInstance() {
        // basic
        HttpRequestDef.Builder<ChangeInstanceRequest, ChangeInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.PUT, ChangeInstanceRequest.class, ChangeInstanceResponse.class)
            .withName("ChangeInstance")
            .withUri(
                "/v2/{project_id}/cas/applications/{application_id}/components/{component_id}/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeInstanceRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeInstanceRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<InstanceModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(InstanceModify.class),
            f -> f.withMarshaller(ChangeInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ChangeResourceInEnvironmentRequest, ChangeResourceInEnvironmentResponse> changeResourceInEnvironment =
        genForchangeResourceInEnvironment();

    private static HttpRequestDef<ChangeResourceInEnvironmentRequest, ChangeResourceInEnvironmentResponse> genForchangeResourceInEnvironment() {
        // basic
        HttpRequestDef.Builder<ChangeResourceInEnvironmentRequest, ChangeResourceInEnvironmentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.PATCH,
                    ChangeResourceInEnvironmentRequest.class,
                    ChangeResourceInEnvironmentResponse.class)
                .withName("ChangeResourceInEnvironment")
                .withUri("/v2/{project_id}/cas/environments/{environment_id}/resources")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ChangeResourceInEnvironmentRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));
        builder.<EnvironmentResourceModify>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EnvironmentResourceModify.class),
            f -> f.withMarshaller(ChangeResourceInEnvironmentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> createApplication =
        genForcreateApplication();

    private static HttpRequestDef<CreateApplicationRequest, CreateApplicationResponse> genForcreateApplication() {
        // basic
        HttpRequestDef.Builder<CreateApplicationRequest, CreateApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateApplicationRequest.class, CreateApplicationResponse.class)
                .withName("CreateApplication")
                .withUri("/v2/{project_id}/cas/applications")
                .withContentType("application/json");

        // requests
        builder.<ApplicationCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ApplicationCreate.class),
            f -> f.withMarshaller(CreateApplicationRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateCamInstanceRequest, CreateCamInstanceResponse> createCamInstance =
        genForcreateCamInstance();

    private static HttpRequestDef<CreateCamInstanceRequest, CreateCamInstanceResponse> genForcreateCamInstance() {
        // basic
        HttpRequestDef.Builder<CreateCamInstanceRequest, CreateCamInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateCamInstanceRequest.class, CreateCamInstanceResponse.class)
                .withName("CreateCamInstance")
                .withUri("/v1/{project_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<InstanceCreation>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(InstanceCreation.class),
            f -> f.withMarshaller(CreateCamInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateComponentRequest, CreateComponentResponse> createComponent =
        genForcreateComponent();

    private static HttpRequestDef<CreateComponentRequest, CreateComponentResponse> genForcreateComponent() {
        // basic
        HttpRequestDef.Builder<CreateComponentRequest, CreateComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateComponentRequest.class, CreateComponentResponse.class)
                .withName("CreateComponent")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/components")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateComponentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<ComponentCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ComponentCreate.class),
            f -> f.withMarshaller(CreateComponentRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateEnvironmentRequest, CreateEnvironmentResponse> createEnvironment =
        genForcreateEnvironment();

    private static HttpRequestDef<CreateEnvironmentRequest, CreateEnvironmentResponse> genForcreateEnvironment() {
        // basic
        HttpRequestDef.Builder<CreateEnvironmentRequest, CreateEnvironmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateEnvironmentRequest.class, CreateEnvironmentResponse.class)
                .withName("CreateEnvironment")
                .withUri("/v2/{project_id}/cas/environments")
                .withContentType("application/json");

        // requests
        builder.<EnvironmentCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(EnvironmentCreate.class),
            f -> f.withMarshaller(CreateEnvironmentRequest::getBody, (req, v) -> {
                req.setBody(v);
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
                .withUri("/v2/{project_id}/cas/applications/{application_id}/components/{component_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateInstanceRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<InstanceCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(InstanceCreate.class),
            f -> f.withMarshaller(CreateInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> createTemplate =
        genForcreateTemplate();

    private static HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> genForcreateTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTemplateRequest, CreateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateRequest.class, CreateTemplateResponse.class)
                .withName("CreateTemplate")
                .withUri("/v1/{project_id}/templates")
                .withContentType("application/json");

        // requests
        builder.<CreateTemplate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(CreateTemplate.class),
            f -> f.withMarshaller(CreateTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> deleteApplication =
        genFordeleteApplication();

    private static HttpRequestDef<DeleteApplicationRequest, DeleteApplicationResponse> genFordeleteApplication() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationRequest, DeleteApplicationResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteApplicationRequest.class, DeleteApplicationResponse.class)
                .withName("DeleteApplication")
                .withUri("/v2/{project_id}/cas/applications/{application_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse> deleteApplicationConfiguration =
        genFordeleteApplicationConfiguration();

    private static HttpRequestDef<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse> genFordeleteApplicationConfiguration() {
        // basic
        HttpRequestDef.Builder<DeleteApplicationConfigurationRequest, DeleteApplicationConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteApplicationConfigurationRequest.class,
                    DeleteApplicationConfigurationResponse.class)
                .withName("DeleteApplicationConfiguration")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationConfigurationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("environment_id",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteApplicationConfigurationRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteComponentRequest, DeleteComponentResponse> deleteComponent =
        genFordeleteComponent();

    private static HttpRequestDef<DeleteComponentRequest, DeleteComponentResponse> genFordeleteComponent() {
        // basic
        HttpRequestDef.Builder<DeleteComponentRequest, DeleteComponentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteComponentRequest.class, DeleteComponentResponse.class)
                .withName("DeleteComponent")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteComponentRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<Boolean>withRequestField("force",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteComponentRequest::getForce, (req, v) -> {
                req.setForce(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteEnvironmentRequest, DeleteEnvironmentResponse> deleteEnvironment =
        genFordeleteEnvironment();

    private static HttpRequestDef<DeleteEnvironmentRequest, DeleteEnvironmentResponse> genFordeleteEnvironment() {
        // basic
        HttpRequestDef.Builder<DeleteEnvironmentRequest, DeleteEnvironmentResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteEnvironmentRequest.class, DeleteEnvironmentResponse.class)
                .withName("DeleteEnvironment")
                .withUri("/v2/{project_id}/cas/environments/{environment_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteEnvironmentRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> deleteInstance =
        genFordeleteInstance();

    private static HttpRequestDef<DeleteInstanceRequest, DeleteInstanceResponse> genFordeleteInstance() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceRequest, DeleteInstanceResponse> builder = HttpRequestDef
            .builder(HttpMethod.DELETE, DeleteInstanceRequest.class, DeleteInstanceResponse.class)
            .withName("DeleteInstance")
            .withUri(
                "/v2/{project_id}/cas/applications/{application_id}/components/{component_id}/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Boolean>withRequestField("force",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Boolean.class),
            f -> f.withMarshaller(DeleteInstanceRequest::getForce, (req, v) -> {
                req.setForce(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteInstanceByIdRequest, DeleteInstanceByIdResponse> deleteInstanceById =
        genFordeleteInstanceById();

    private static HttpRequestDef<DeleteInstanceByIdRequest, DeleteInstanceByIdResponse> genFordeleteInstanceById() {
        // basic
        HttpRequestDef.Builder<DeleteInstanceByIdRequest, DeleteInstanceByIdResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteInstanceByIdRequest.class, DeleteInstanceByIdResponse.class)
                .withName("DeleteInstanceById")
                .withUri("/v1/{project_id}/instances/{instance_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteInstanceByIdRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genFordeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genFordeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v1/{project_id}/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeployInstanceRequest, DeployInstanceResponse> deployInstance =
        genFordeployInstance();

    private static HttpRequestDef<DeployInstanceRequest, DeployInstanceResponse> genFordeployInstance() {
        // basic
        HttpRequestDef.Builder<DeployInstanceRequest, DeployInstanceResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeployInstanceRequest.class, DeployInstanceResponse.class)
                .withName("DeployInstance")
                .withUri("/v1/{project_id}/instance/deployments")
                .withContentType("application/json");

        // requests
        builder.<InstanceDeployment>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(InstanceDeployment.class),
            f -> f.withMarshaller(DeployInstanceRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> listApplications =
        genForlistApplications();

    private static HttpRequestDef<ListApplicationsRequest, ListApplicationsResponse> genForlistApplications() {
        // basic
        HttpRequestDef.Builder<ListApplicationsRequest, ListApplicationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListApplicationsRequest.class, ListApplicationsResponse.class)
                .withName("ListApplications")
                .withUri("/v2/{project_id}/cas/applications")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListApplicationsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListApplicationsRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<ListApplicationsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListApplicationsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListApplicationsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListComponentsRequest, ListComponentsResponse> listComponents =
        genForlistComponents();

    private static HttpRequestDef<ListComponentsRequest, ListComponentsResponse> genForlistComponents() {
        // basic
        HttpRequestDef.Builder<ListComponentsRequest, ListComponentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListComponentsRequest.class, ListComponentsResponse.class)
                .withName("ListComponents")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/components")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListComponentsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListComponentsRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<ListComponentsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListComponentsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListComponentsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> listEnvironments =
        genForlistEnvironments();

    private static HttpRequestDef<ListEnvironmentsRequest, ListEnvironmentsResponse> genForlistEnvironments() {
        // basic
        HttpRequestDef.Builder<ListEnvironmentsRequest, ListEnvironmentsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnvironmentsRequest.class, ListEnvironmentsResponse.class)
                .withName("ListEnvironments")
                .withUri("/v2/{project_id}/cas/environments")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<ListEnvironmentsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListEnvironmentsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListEnvironmentsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListInstanceSnapshotsRequest, ListInstanceSnapshotsResponse> listInstanceSnapshots =
        genForlistInstanceSnapshots();

    private static HttpRequestDef<ListInstanceSnapshotsRequest, ListInstanceSnapshotsResponse> genForlistInstanceSnapshots() {
        // basic
        HttpRequestDef.Builder<ListInstanceSnapshotsRequest, ListInstanceSnapshotsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListInstanceSnapshotsRequest.class, ListInstanceSnapshotsResponse.class)
            .withName("ListInstanceSnapshots")
            .withUri(
                "/v2/{project_id}/cas/applications/{application_id}/components/{component_id}/instances/{instance_id}/snapshots")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSnapshotsRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSnapshotsRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSnapshotsRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSnapshotsRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstanceSnapshotsRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("snapshot_order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstanceSnapshotsRequest::getSnapshotOrderBy, (req, v) -> {
                req.setSnapshotOrderBy(v);
            }));
        builder.<ListInstanceSnapshotsRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstanceSnapshotsRequest.OrderEnum.class),
            f -> f.withMarshaller(ListInstanceSnapshotsRequest::getOrder, (req, v) -> {
                req.setOrder(v);
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
                .withUri("/v2/{project_id}/cas/applications/{application_id}/components/{component_id}/instances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListInstancesRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("order_by",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListInstancesRequest::getOrderBy, (req, v) -> {
                req.setOrderBy(v);
            }));
        builder.<ListInstancesRequest.OrderEnum>withRequestField("order",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ListInstancesRequest.OrderEnum.class),
            f -> f.withMarshaller(ListInstancesRequest::getOrder, (req, v) -> {
                req.setOrder(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse> showApplicationConfiguration =
        genForshowApplicationConfiguration();

    private static HttpRequestDef<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse> genForshowApplicationConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowApplicationConfigurationRequest, ShowApplicationConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowApplicationConfigurationRequest.class,
                    ShowApplicationConfigurationResponse.class)
                .withName("ShowApplicationConfiguration")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/configuration")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationConfigurationRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("environment_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationConfigurationRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowApplicationDetailRequest, ShowApplicationDetailResponse> showApplicationDetail =
        genForshowApplicationDetail();

    private static HttpRequestDef<ShowApplicationDetailRequest, ShowApplicationDetailResponse> genForshowApplicationDetail() {
        // basic
        HttpRequestDef.Builder<ShowApplicationDetailRequest, ShowApplicationDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowApplicationDetailRequest.class, ShowApplicationDetailResponse.class)
            .withName("ShowApplicationDetail")
            .withUri("/v2/{project_id}/cas/applications/{application_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowApplicationDetailRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComponentDetailRequest, ShowComponentDetailResponse> showComponentDetail =
        genForshowComponentDetail();

    private static HttpRequestDef<ShowComponentDetailRequest, ShowComponentDetailResponse> genForshowComponentDetail() {
        // basic
        HttpRequestDef.Builder<ShowComponentDetailRequest, ShowComponentDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowComponentDetailRequest.class, ShowComponentDetailResponse.class)
                .withName("ShowComponentDetail")
                .withUri("/v2/{project_id}/cas/applications/{application_id}/components/{component_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentDetailRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComponentDetailRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> showEnvironmentDetail =
        genForshowEnvironmentDetail();

    private static HttpRequestDef<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> genForshowEnvironmentDetail() {
        // basic
        HttpRequestDef.Builder<ShowEnvironmentDetailRequest, ShowEnvironmentDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowEnvironmentDetailRequest.class, ShowEnvironmentDetailResponse.class)
            .withName("ShowEnvironmentDetail")
            .withUri("/v2/{project_id}/cas/environments/{environment_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("environment_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowEnvironmentDetailRequest::getEnvironmentId, (req, v) -> {
                req.setEnvironmentId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowInstanceDetailRequest, ShowInstanceDetailResponse> showInstanceDetail =
        genForshowInstanceDetail();

    private static HttpRequestDef<ShowInstanceDetailRequest, ShowInstanceDetailResponse> genForshowInstanceDetail() {
        // basic
        HttpRequestDef.Builder<ShowInstanceDetailRequest, ShowInstanceDetailResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowInstanceDetailRequest.class, ShowInstanceDetailResponse.class)
            .withName("ShowInstanceDetail")
            .withUri(
                "/v2/{project_id}/cas/applications/{application_id}/components/{component_id}/instances/{instance_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDetailRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDetailRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowInstanceDetailRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> showJobDetail =
        genForshowJobDetail();

    private static HttpRequestDef<ShowJobDetailRequest, ShowJobDetailResponse> genForshowJobDetail() {
        // basic
        HttpRequestDef.Builder<ShowJobDetailRequest, ShowJobDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowJobDetailRequest.class, ShowJobDetailResponse.class)
                .withName("ShowJobDetail")
                .withUri("/v2/{project_id}/cas/jobs/{job_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("job_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getJobId, (req, v) -> {
                req.setJobId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getLimit, (req, v) -> {
                req.setLimit(v);
            }));
        builder.<Integer>withRequestField("offset",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getOffset, (req, v) -> {
                req.setOffset(v);
            }));
        builder.<String>withRequestField("desc",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowJobDetailRequest::getDesc, (req, v) -> {
                req.setDesc(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateInstanceActionRequest, UpdateInstanceActionResponse> updateInstanceAction =
        genForupdateInstanceAction();

    private static HttpRequestDef<UpdateInstanceActionRequest, UpdateInstanceActionResponse> genForupdateInstanceAction() {
        // basic
        HttpRequestDef.Builder<UpdateInstanceActionRequest, UpdateInstanceActionResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateInstanceActionRequest.class, UpdateInstanceActionResponse.class)
            .withName("UpdateInstanceAction")
            .withUri(
                "/v2/{project_id}/cas/applications/{application_id}/components/{component_id}/instances/{instance_id}/action")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("application_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceActionRequest::getApplicationId, (req, v) -> {
                req.setApplicationId(v);
            }));
        builder.<String>withRequestField("component_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceActionRequest::getComponentId, (req, v) -> {
                req.setComponentId(v);
            }));
        builder.<String>withRequestField("instance_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateInstanceActionRequest::getInstanceId, (req, v) -> {
                req.setInstanceId(v);
            }));
        builder.<InstanceAction>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(InstanceAction.class),
            f -> f.withMarshaller(UpdateInstanceActionRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> updateTemplate =
        genForupdateTemplate();

    private static HttpRequestDef<UpdateTemplateRequest, UpdateTemplateResponse> genForupdateTemplate() {
        // basic
        HttpRequestDef.Builder<UpdateTemplateRequest, UpdateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateTemplateRequest.class, UpdateTemplateResponse.class)
                .withName("UpdateTemplate")
                .withUri("/v1/{project_id}/templates/{template_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getTemplateId, (req, v) -> {
                req.setTemplateId(v);
            }));
        builder.<UpdateTemplates>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(UpdateTemplates.class),
            f -> f.withMarshaller(UpdateTemplateRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateFileRequest, CreateFileResponse> createFile = genForcreateFile();

    private static HttpRequestDef<CreateFileRequest, CreateFileResponse> genForcreateFile() {
        // basic
        HttpRequestDef.Builder<CreateFileRequest, CreateFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateFileRequest.class, CreateFileResponse.class)
                .withName("CreateFile")
                .withUri("/v1/{project_id}/git/files/{namespace}/{project}/{path}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getProject, (req, v) -> {
                req.setProject(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getRef, (req, v) -> {
                req.setRef(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateFileRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));
        builder.<FileCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FileCreate.class),
            f -> f.withMarshaller(CreateFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateHookRequest, CreateHookResponse> createHook = genForcreateHook();

    private static HttpRequestDef<CreateHookRequest, CreateHookResponse> genForcreateHook() {
        // basic
        HttpRequestDef.Builder<CreateHookRequest, CreateHookResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateHookRequest.class, CreateHookResponse.class)
                .withName("CreateHook")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/hooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHookRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHookRequest::getProject, (req, v) -> {
                req.setProject(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateHookRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));
        builder.<HookCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(HookCreate.class),
            f -> f.withMarshaller(CreateHookRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateOAuthRequest, CreateOAuthResponse> createOAuth = genForcreateOAuth();

    private static HttpRequestDef<CreateOAuthRequest, CreateOAuthResponse> genForcreateOAuth() {
        // basic
        HttpRequestDef.Builder<CreateOAuthRequest, CreateOAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateOAuthRequest.class, CreateOAuthResponse.class)
                .withName("CreateOAuth")
                .withUri("/v1/{project_id}/git/auths/{repo_type}/oauth")
                .withContentType("application/json");

        // requests
        builder.<CreateOAuthRequest.RepoTypeEnum>withRequestField("repo_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOAuthRequest.RepoTypeEnum.class),
            f -> f.withMarshaller(CreateOAuthRequest::getRepoType, (req, v) -> {
                req.setRepoType(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateOAuthRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));
        builder.<OAuth>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(OAuth.class),
            f -> f.withMarshaller(CreateOAuthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePasswordAuthRequest, CreatePasswordAuthResponse> createPasswordAuth =
        genForcreatePasswordAuth();

    private static HttpRequestDef<CreatePasswordAuthRequest, CreatePasswordAuthResponse> genForcreatePasswordAuth() {
        // basic
        HttpRequestDef.Builder<CreatePasswordAuthRequest, CreatePasswordAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePasswordAuthRequest.class, CreatePasswordAuthResponse.class)
                .withName("CreatePasswordAuth")
                .withUri("/v1/{project_id}/git/auths/{repo_type}/password")
                .withContentType("application/json");

        // requests
        builder.<CreatePasswordAuthRequest.RepoTypeEnum>withRequestField("repo_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePasswordAuthRequest.RepoTypeEnum.class),
            f -> f.withMarshaller(CreatePasswordAuthRequest::getRepoType, (req, v) -> {
                req.setRepoType(v);
            }));
        builder.<AccessPassword>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AccessPassword.class),
            f -> f.withMarshaller(CreatePasswordAuthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreatePersonalAuthRequest, CreatePersonalAuthResponse> createPersonalAuth =
        genForcreatePersonalAuth();

    private static HttpRequestDef<CreatePersonalAuthRequest, CreatePersonalAuthResponse> genForcreatePersonalAuth() {
        // basic
        HttpRequestDef.Builder<CreatePersonalAuthRequest, CreatePersonalAuthResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreatePersonalAuthRequest.class, CreatePersonalAuthResponse.class)
                .withName("CreatePersonalAuth")
                .withUri("/v1/{project_id}/git/auths/{repo_type}/personal")
                .withContentType("application/json");

        // requests
        builder.<CreatePersonalAuthRequest.RepoTypeEnum>withRequestField("repo_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreatePersonalAuthRequest.RepoTypeEnum.class),
            f -> f.withMarshaller(CreatePersonalAuthRequest::getRepoType, (req, v) -> {
                req.setRepoType(v);
            }));
        builder.<AccessToken>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(AccessToken.class),
            f -> f.withMarshaller(CreatePersonalAuthRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateProjectRequest, CreateProjectResponse> createProject =
        genForcreateProject();

    private static HttpRequestDef<CreateProjectRequest, CreateProjectResponse> genForcreateProject() {
        // basic
        HttpRequestDef.Builder<CreateProjectRequest, CreateProjectResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateProjectRequest.class, CreateProjectResponse.class)
                .withName("CreateProject")
                .withUri("/v1/{project_id}/git/repos/{namespace}/projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProjectRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateProjectRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));
        builder.<ProjectCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(ProjectCreate.class),
            f -> f.withMarshaller(CreateProjectRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTagRequest, CreateTagResponse> createTag = genForcreateTag();

    private static HttpRequestDef<CreateTagRequest, CreateTagResponse> genForcreateTag() {
        // basic
        HttpRequestDef.Builder<CreateTagRequest, CreateTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTagRequest.class, CreateTagResponse.class)
                .withName("CreateTag")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getProject, (req, v) -> {
                req.setProject(v);
            }));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getRef, (req, v) -> {
                req.setRef(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(CreateTagRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));
        builder.<TagCreate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(TagCreate.class),
            f -> f.withMarshaller(CreateTagRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteAuthorizeRequest, DeleteAuthorizeResponse> deleteAuthorize =
        genFordeleteAuthorize();

    private static HttpRequestDef<DeleteAuthorizeRequest, DeleteAuthorizeResponse> genFordeleteAuthorize() {
        // basic
        HttpRequestDef.Builder<DeleteAuthorizeRequest, DeleteAuthorizeResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteAuthorizeRequest.class, DeleteAuthorizeResponse.class)
                .withName("DeleteAuthorize")
                .withUri("/v1/{project_id}/git/auths/{name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteAuthorizeRequest::getName, (req, v) -> {
                req.setName(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteFileRequest, DeleteFileResponse> deleteFile = genFordeleteFile();

    private static HttpRequestDef<DeleteFileRequest, DeleteFileResponse> genFordeleteFile() {
        // basic
        HttpRequestDef.Builder<DeleteFileRequest, DeleteFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteFileRequest.class, DeleteFileResponse.class)
                .withName("DeleteFile")
                .withUri("/v1/{project_id}/git/files/{namespace}/{project}/{path}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getProject, (req, v) -> {
                req.setProject(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getRef, (req, v) -> {
                req.setRef(v);
            }));
        builder.<String>withRequestField("message",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getMessage, (req, v) -> {
                req.setMessage(v);
            }));
        builder.<String>withRequestField("sha",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getSha, (req, v) -> {
                req.setSha(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteFileRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteHookRequest, DeleteHookResponse> deleteHook = genFordeleteHook();

    private static HttpRequestDef<DeleteHookRequest, DeleteHookResponse> genFordeleteHook() {
        // basic
        HttpRequestDef.Builder<DeleteHookRequest, DeleteHookResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteHookRequest.class, DeleteHookResponse.class)
                .withName("DeleteHook")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/hooks/{hook_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHookRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHookRequest::getProject, (req, v) -> {
                req.setProject(v);
            }));
        builder.<String>withRequestField("hook_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHookRequest::getHookId, (req, v) -> {
                req.setHookId(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteHookRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTagRequest, DeleteTagResponse> deleteTag = genFordeleteTag();

    private static HttpRequestDef<DeleteTagRequest, DeleteTagResponse> genFordeleteTag() {
        // basic
        HttpRequestDef.Builder<DeleteTagRequest, DeleteTagResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTagRequest.class, DeleteTagResponse.class)
                .withName("DeleteTag")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/tags/{tag_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getProject, (req, v) -> {
                req.setProject(v);
            }));
        builder.<String>withRequestField("tag_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getTagName, (req, v) -> {
                req.setTagName(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTagRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListAuthorizationsRequest, ListAuthorizationsResponse> listAuthorizations =
        genForlistAuthorizations();

    private static HttpRequestDef<ListAuthorizationsRequest, ListAuthorizationsResponse> genForlistAuthorizations() {
        // basic
        HttpRequestDef.Builder<ListAuthorizationsRequest, ListAuthorizationsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListAuthorizationsRequest.class, ListAuthorizationsResponse.class)
                .withName("ListAuthorizations")
                .withUri("/v1/{project_id}/git/auths")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListBranchesRequest, ListBranchesResponse> listBranches = genForlistBranches();

    private static HttpRequestDef<ListBranchesRequest, ListBranchesResponse> genForlistBranches() {
        // basic
        HttpRequestDef.Builder<ListBranchesRequest, ListBranchesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListBranchesRequest.class, ListBranchesResponse.class)
                .withName("ListBranches")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/branches")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBranchesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBranchesRequest::getProject, (req, v) -> {
                req.setProject(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListBranchesRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListCommitsRequest, ListCommitsResponse> listCommits = genForlistCommits();

    private static HttpRequestDef<ListCommitsRequest, ListCommitsResponse> genForlistCommits() {
        // basic
        HttpRequestDef.Builder<ListCommitsRequest, ListCommitsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListCommitsRequest.class, ListCommitsResponse.class)
                .withName("ListCommits")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/commits")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getProject, (req, v) -> {
                req.setProject(v);
            }));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getRef, (req, v) -> {
                req.setRef(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListCommitsRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListHooksRequest, ListHooksResponse> listHooks = genForlistHooks();

    private static HttpRequestDef<ListHooksRequest, ListHooksResponse> genForlistHooks() {
        // basic
        HttpRequestDef.Builder<ListHooksRequest, ListHooksResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListHooksRequest.class, ListHooksResponse.class)
                .withName("ListHooks")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/hooks")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHooksRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHooksRequest::getProject, (req, v) -> {
                req.setProject(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListHooksRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListNamespacesRequest, ListNamespacesResponse> listNamespaces =
        genForlistNamespaces();

    private static HttpRequestDef<ListNamespacesRequest, ListNamespacesResponse> genForlistNamespaces() {
        // basic
        HttpRequestDef.Builder<ListNamespacesRequest, ListNamespacesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListNamespacesRequest.class, ListNamespacesResponse.class)
                .withName("ListNamespaces")
                .withUri("/v1/{project_id}/git/repos/namespaces")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListNamespacesRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListProjectsRequest, ListProjectsResponse> listProjects = genForlistProjects();

    private static HttpRequestDef<ListProjectsRequest, ListProjectsResponse> genForlistProjects() {
        // basic
        HttpRequestDef.Builder<ListProjectsRequest, ListProjectsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListProjectsRequest.class, ListProjectsResponse.class)
                .withName("ListProjects")
                .withUri("/v1/{project_id}/git/repos/{namespace}/projects")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListProjectsRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTagsRequest, ListTagsResponse> listTags = genForlistTags();

    private static HttpRequestDef<ListTagsRequest, ListTagsResponse> genForlistTags() {
        // basic
        HttpRequestDef.Builder<ListTagsRequest, ListTagsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTagsRequest.class, ListTagsResponse.class)
                .withName("ListTags")
                .withUri("/v1/{project_id}/git/repos/{namespace}/{project}/tags")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getProject, (req, v) -> {
                req.setProject(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTagsRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTreesRequest, ListTreesResponse> listTrees = genForlistTrees();

    private static HttpRequestDef<ListTreesRequest, ListTreesResponse> genForlistTrees() {
        // basic
        HttpRequestDef.Builder<ListTreesRequest, ListTreesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTreesRequest.class, ListTreesResponse.class)
                .withName("ListTrees")
                .withUri("/v1/{project_id}/git/files/{namespace}/{project}/trees")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTreesRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTreesRequest::getProject, (req, v) -> {
                req.setProject(v);
            }));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTreesRequest::getRef, (req, v) -> {
                req.setRef(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListTreesRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowContentRequest, ShowContentResponse> showContent = genForshowContent();

    private static HttpRequestDef<ShowContentRequest, ShowContentResponse> genForshowContent() {
        // basic
        HttpRequestDef.Builder<ShowContentRequest, ShowContentResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowContentRequest.class, ShowContentResponse.class)
                .withName("ShowContent")
                .withUri("/v1/{project_id}/git/files/{namespace}/{project}/{path}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContentRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContentRequest::getProject, (req, v) -> {
                req.setProject(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContentRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContentRequest::getRef, (req, v) -> {
                req.setRef(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowContentRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowProjectDetailRequest, ShowProjectDetailResponse> showProjectDetail =
        genForshowProjectDetail();

    private static HttpRequestDef<ShowProjectDetailRequest, ShowProjectDetailResponse> genForshowProjectDetail() {
        // basic
        HttpRequestDef.Builder<ShowProjectDetailRequest, ShowProjectDetailResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowProjectDetailRequest.class, ShowProjectDetailResponse.class)
                .withName("ShowProjectDetail")
                .withUri("/v1/{project_id}/git/repos/project-info")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("clone_url",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectDetailRequest::getCloneUrl, (req, v) -> {
                req.setCloneUrl(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowProjectDetailRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowRedirectUrlRequest, ShowRedirectUrlResponse> showRedirectUrl =
        genForshowRedirectUrl();

    private static HttpRequestDef<ShowRedirectUrlRequest, ShowRedirectUrlResponse> genForshowRedirectUrl() {
        // basic
        HttpRequestDef.Builder<ShowRedirectUrlRequest, ShowRedirectUrlResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowRedirectUrlRequest.class, ShowRedirectUrlResponse.class)
                .withName("ShowRedirectUrl")
                .withUri("/v1/{project_id}/git/auths/{repo_type}/redirect")
                .withContentType("application/json");

        // requests
        builder.<ShowRedirectUrlRequest.RepoTypeEnum>withRequestField("repo_type",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowRedirectUrlRequest.RepoTypeEnum.class),
            f -> f.withMarshaller(ShowRedirectUrlRequest::getRepoType, (req, v) -> {
                req.setRepoType(v);
            }));
        builder.<String>withRequestField("tag",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowRedirectUrlRequest::getTag, (req, v) -> {
                req.setTag(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateFileRequest, UpdateFileResponse> updateFile = genForupdateFile();

    private static HttpRequestDef<UpdateFileRequest, UpdateFileResponse> genForupdateFile() {
        // basic
        HttpRequestDef.Builder<UpdateFileRequest, UpdateFileResponse> builder =
            HttpRequestDef.builder(HttpMethod.PUT, UpdateFileRequest.class, UpdateFileResponse.class)
                .withName("UpdateFile")
                .withUri("/v1/{project_id}/git/files/{namespace}/{project}/{path}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("namespace",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFileRequest::getNamespace, (req, v) -> {
                req.setNamespace(v);
            }));
        builder.<String>withRequestField("project",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFileRequest::getProject, (req, v) -> {
                req.setProject(v);
            }));
        builder.<String>withRequestField("path",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFileRequest::getPath, (req, v) -> {
                req.setPath(v);
            }));
        builder.<String>withRequestField("ref",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFileRequest::getRef, (req, v) -> {
                req.setRef(v);
            }));
        builder.<String>withRequestField("X-Repo-Auth",
            LocationType.Header,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateFileRequest::getXRepoAuth, (req, v) -> {
                req.setXRepoAuth(v);
            }));
        builder.<FileUpdate>withRequestField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(FileUpdate.class),
            f -> f.withMarshaller(UpdateFileRequest::getBody, (req, v) -> {
                req.setBody(v);
            }));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> listFlavors = genForlistFlavors();

    private static HttpRequestDef<ListFlavorsRequest, ListFlavorsResponse> genForlistFlavors() {
        // basic
        HttpRequestDef.Builder<ListFlavorsRequest, ListFlavorsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListFlavorsRequest.class, ListFlavorsResponse.class)
                .withName("ListFlavors")
                .withUri("/v2/{project_id}/cas/metadata/flavors")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListRuntimesRequest, ListRuntimesResponse> listRuntimes = genForlistRuntimes();

    private static HttpRequestDef<ListRuntimesRequest, ListRuntimesResponse> genForlistRuntimes() {
        // basic
        HttpRequestDef.Builder<ListRuntimesRequest, ListRuntimesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListRuntimesRequest.class, ListRuntimesResponse.class)
                .withName("ListRuntimes")
                .withUri("/v2/{project_id}/cas/metadata/runtimes")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> listTemplates =
        genForlistTemplates();

    private static HttpRequestDef<ListTemplatesRequest, ListTemplatesResponse> genForlistTemplates() {
        // basic
        HttpRequestDef.Builder<ListTemplatesRequest, ListTemplatesResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListTemplatesRequest.class, ListTemplatesResponse.class)
                .withName("ListTemplates")
                .withUri("/v2/{project_id}/cas/metadata/templates")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

}
