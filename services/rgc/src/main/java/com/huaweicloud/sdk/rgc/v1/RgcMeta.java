package com.huaweicloud.sdk.rgc.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.rgc.v1.model.ControlOperateReqBody;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateResponse;

@SuppressWarnings("unchecked")
public class RgcMeta {

    public static final HttpRequestDef<DisableControlRequest, DisableControlResponse> disableControl =
        genForDisableControl();

    private static HttpRequestDef<DisableControlRequest, DisableControlResponse> genForDisableControl() {
        // basic
        HttpRequestDef.Builder<DisableControlRequest, DisableControlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DisableControlRequest.class, DisableControlResponse.class)
                .withName("DisableControl")
                .withUri("/v1/governance/controls/disable")
                .withContentType("application/json");

        // requests
        builder.<ControlOperateReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ControlOperateReqBody.class),
            f -> f.withMarshaller(DisableControlRequest::getBody, DisableControlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnableControlRequest, EnableControlResponse> enableControl =
        genForEnableControl();

    private static HttpRequestDef<EnableControlRequest, EnableControlResponse> genForEnableControl() {
        // basic
        HttpRequestDef.Builder<EnableControlRequest, EnableControlResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnableControlRequest.class, EnableControlResponse.class)
                .withName("EnableControl")
                .withUri("/v1/governance/controls/enable")
                .withContentType("application/json");

        // requests
        builder.<ControlOperateReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ControlOperateReqBody.class),
            f -> f.withMarshaller(EnableControlRequest::getBody, EnableControlRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListControlsForOrganizationUnitRequest, ListControlsForOrganizationUnitResponse> listControlsForOrganizationUnit =
        genForListControlsForOrganizationUnit();

    private static HttpRequestDef<ListControlsForOrganizationUnitRequest, ListControlsForOrganizationUnitResponse> genForListControlsForOrganizationUnit() {
        // basic
        HttpRequestDef.Builder<ListControlsForOrganizationUnitRequest, ListControlsForOrganizationUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListControlsForOrganizationUnitRequest.class,
                    ListControlsForOrganizationUnitResponse.class)
                .withName("ListControlsForOrganizationUnit")
                .withUri("/v1/governance/managed-organization-units/{managed_organization_unit_id}/controls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organization_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsForOrganizationUnitRequest::getManagedOrganizationUnitId,
                ListControlsForOrganizationUnitRequest::setManagedOrganizationUnitId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListControlsForOrganizationUnitRequest::getLimit,
                ListControlsForOrganizationUnitRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsForOrganizationUnitRequest::getMarker,
                ListControlsForOrganizationUnitRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowControlOperateRequest, ShowControlOperateResponse> showControlOperate =
        genForShowControlOperate();

    private static HttpRequestDef<ShowControlOperateRequest, ShowControlOperateResponse> genForShowControlOperate() {
        // basic
        HttpRequestDef.Builder<ShowControlOperateRequest, ShowControlOperateResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowControlOperateRequest.class, ShowControlOperateResponse.class)
                .withName("ShowControlOperate")
                .withUri("/v1/governance/operation-control-status/{operation_control_status_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("operation_control_status_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowControlOperateRequest::getOperationControlStatusId,
                ShowControlOperateRequest::setOperationControlStatusId));

        // response

        return builder.build();
    }

}
