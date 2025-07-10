package com.huaweicloud.sdk.rgc.v1;

import com.huaweicloud.sdk.core.TypeCasts;
import com.huaweicloud.sdk.core.http.FieldExistence;
import com.huaweicloud.sdk.core.http.HttpMethod;
import com.huaweicloud.sdk.core.http.HttpRequestDef;
import com.huaweicloud.sdk.core.http.LocationType;
import com.huaweicloud.sdk.rgc.v1.model.BestPracticeCheckItemDetail;
import com.huaweicloud.sdk.rgc.v1.model.CheckLaunchRequest;
import com.huaweicloud.sdk.rgc.v1.model.CheckLaunchResponse;
import com.huaweicloud.sdk.rgc.v1.model.ControlOperateReqBody;
import com.huaweicloud.sdk.rgc.v1.model.CreateAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.CreateAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.CreateBestPracticeDetectRequest;
import com.huaweicloud.sdk.rgc.v1.model.CreateBestPracticeDetectResponse;
import com.huaweicloud.sdk.rgc.v1.model.CreateManagedAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.CreateManagedOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.CreateManagedOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.CreateOrganizationalUnitReqBody;
import com.huaweicloud.sdk.rgc.v1.model.CreateTemplateRequest;
import com.huaweicloud.sdk.rgc.v1.model.CreateTemplateRequestBody;
import com.huaweicloud.sdk.rgc.v1.model.CreateTemplateResponse;
import com.huaweicloud.sdk.rgc.v1.model.DeleteLandingZoneRequest;
import com.huaweicloud.sdk.rgc.v1.model.DeleteLandingZoneResponse;
import com.huaweicloud.sdk.rgc.v1.model.DeleteManagedOrganizationalUnitsRequest;
import com.huaweicloud.sdk.rgc.v1.model.DeleteManagedOrganizationalUnitsResponse;
import com.huaweicloud.sdk.rgc.v1.model.DeleteTemplateRequest;
import com.huaweicloud.sdk.rgc.v1.model.DeleteTemplateResponse;
import com.huaweicloud.sdk.rgc.v1.model.DeregisterOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.DeregisterOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.DisableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.EnableControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.EnrollAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.EnrollAccountRequestBody;
import com.huaweicloud.sdk.rgc.v1.model.EnrollAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListConfigRuleCompliancesRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListConfigRuleCompliancesResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlViolationsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlViolationsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsForOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListControlsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListDriftDetailsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListDriftDetailsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListEnabledControlsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListEnabledControlsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListExternalConfigRuleCompliancesRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListExternalConfigRuleCompliancesResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedAccountsForParentRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedAccountsForParentResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedAccountsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedAccountsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedOrganizationalUnitsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListManagedOrganizationalUnitsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListOperationRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListOperationResponse;
import com.huaweicloud.sdk.rgc.v1.model.ListPredefinedTemplatesRequest;
import com.huaweicloud.sdk.rgc.v1.model.ListPredefinedTemplatesResponse;
import com.huaweicloud.sdk.rgc.v1.model.ReRegisterOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ReRegisterOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.RegisterOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.RegisterOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.SetupLandingZoneReqBody;
import com.huaweicloud.sdk.rgc.v1.model.SetupLandingZoneRequest;
import com.huaweicloud.sdk.rgc.v1.model.SetupLandingZoneResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowAvailableUpdatesRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowAvailableUpdatesResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowBestPracticeDetailsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowBestPracticeDetailsResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowBestPracticeOverviewRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowBestPracticeOverviewResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowBestPracticeStatusRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowBestPracticeStatusResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowComplianceStatusForAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowComplianceStatusForAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowComplianceStatusForOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowComplianceStatusForOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlOperateResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlsForAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlsForAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlsForOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowControlsForOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowHomeRegionRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowHomeRegionResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneConfigurationRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneConfigurationResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneIdentityCenterRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneIdentityCenterResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneStatusRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowLandingZoneStatusResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedAccountTemplateRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedAccountTemplateResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedCoreAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedCoreAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedOrganizationalUnitRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowManagedOrganizationalUnitResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowOperationRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowOperationResponse;
import com.huaweicloud.sdk.rgc.v1.model.ShowTemplateDeployParamsRequest;
import com.huaweicloud.sdk.rgc.v1.model.ShowTemplateDeployParamsResponse;
import com.huaweicloud.sdk.rgc.v1.model.UnEnrollAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.UnEnrollAccountResponse;
import com.huaweicloud.sdk.rgc.v1.model.UpdateManagedAccountRequest;
import com.huaweicloud.sdk.rgc.v1.model.UpdateManagedAccountRequestBody;
import com.huaweicloud.sdk.rgc.v1.model.UpdateManagedAccountResponse;

import java.util.List;

@SuppressWarnings("unchecked")
public class RgcMeta {

    public static final HttpRequestDef<CreateBestPracticeDetectRequest, CreateBestPracticeDetectResponse> createBestPracticeDetect =
        genForCreateBestPracticeDetect();

    private static HttpRequestDef<CreateBestPracticeDetectRequest, CreateBestPracticeDetectResponse> genForCreateBestPracticeDetect() {
        // basic
        HttpRequestDef.Builder<CreateBestPracticeDetectRequest, CreateBestPracticeDetectResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST, CreateBestPracticeDetectRequest.class, CreateBestPracticeDetectResponse.class)
                .withName("CreateBestPracticeDetect")
                .withUri("/v1/best-practice/detect")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBestPracticeDetailsRequest, ShowBestPracticeDetailsResponse> showBestPracticeDetails =
        genForShowBestPracticeDetails();

    private static HttpRequestDef<ShowBestPracticeDetailsRequest, ShowBestPracticeDetailsResponse> genForShowBestPracticeDetails() {
        // basic
        HttpRequestDef.Builder<ShowBestPracticeDetailsRequest, ShowBestPracticeDetailsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBestPracticeDetailsRequest.class, ShowBestPracticeDetailsResponse.class)
            .withName("ShowBestPracticeDetails")
            .withUri("/v1/best-practice/detection-details")
            .withContentType("application/json");

        // requests

        // response
        builder.<List<BestPracticeCheckItemDetail>>withResponseField("body",
            LocationType.Body,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(List.class),
            f -> f.withMarshaller(ShowBestPracticeDetailsResponse::getBody, ShowBestPracticeDetailsResponse::setBody)
                .withInnerContainerType(BestPracticeCheckItemDetail.class));

        return builder.build();
    }

    public static final HttpRequestDef<ShowBestPracticeOverviewRequest, ShowBestPracticeOverviewResponse> showBestPracticeOverview =
        genForShowBestPracticeOverview();

    private static HttpRequestDef<ShowBestPracticeOverviewRequest, ShowBestPracticeOverviewResponse> genForShowBestPracticeOverview() {
        // basic
        HttpRequestDef.Builder<ShowBestPracticeOverviewRequest, ShowBestPracticeOverviewResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowBestPracticeOverviewRequest.class, ShowBestPracticeOverviewResponse.class)
                .withName("ShowBestPracticeOverview")
                .withUri("/v1/best-practice/detection-overview")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowBestPracticeStatusRequest, ShowBestPracticeStatusResponse> showBestPracticeStatus =
        genForShowBestPracticeStatus();

    private static HttpRequestDef<ShowBestPracticeStatusRequest, ShowBestPracticeStatusResponse> genForShowBestPracticeStatus() {
        // basic
        HttpRequestDef.Builder<ShowBestPracticeStatusRequest, ShowBestPracticeStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowBestPracticeStatusRequest.class, ShowBestPracticeStatusResponse.class)
            .withName("ShowBestPracticeStatus")
            .withUri("/v1/best-practice/status")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

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

    public static final HttpRequestDef<ListConfigRuleCompliancesRequest, ListConfigRuleCompliancesResponse> listConfigRuleCompliances =
        genForListConfigRuleCompliances();

    private static HttpRequestDef<ListConfigRuleCompliancesRequest, ListConfigRuleCompliancesResponse> genForListConfigRuleCompliances() {
        // basic
        HttpRequestDef.Builder<ListConfigRuleCompliancesRequest, ListConfigRuleCompliancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListConfigRuleCompliancesRequest.class,
                    ListConfigRuleCompliancesResponse.class)
                .withName("ListConfigRuleCompliances")
                .withUri("/v1/governance/managed-accounts/{managed_account_id}/config-rule-compliances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListConfigRuleCompliancesRequest::getManagedAccountId,
                ListConfigRuleCompliancesRequest::setManagedAccountId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListControlViolationsRequest, ListControlViolationsResponse> listControlViolations =
        genForListControlViolations();

    private static HttpRequestDef<ListControlViolationsRequest, ListControlViolationsResponse> genForListControlViolations() {
        // basic
        HttpRequestDef.Builder<ListControlViolationsRequest, ListControlViolationsResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListControlViolationsRequest.class, ListControlViolationsResponse.class)
            .withName("ListControlViolations")
            .withUri("/v1/governance/control-violations")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlViolationsRequest::getAccountId,
                ListControlViolationsRequest::setAccountId));
        builder.<String>withRequestField("organizational_unit_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlViolationsRequest::getOrganizationalUnitId,
                ListControlViolationsRequest::setOrganizationalUnitId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListControlsRequest, ListControlsResponse> listControls = genForListControls();

    private static HttpRequestDef<ListControlsRequest, ListControlsResponse> genForListControls() {
        // basic
        HttpRequestDef.Builder<ListControlsRequest, ListControlsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListControlsRequest.class, ListControlsResponse.class)
                .withName("ListControls")
                .withUri("/v1/governance/controls")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListControlsRequest::getLimit, ListControlsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsRequest::getMarker, ListControlsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListControlsForAccountRequest, ListControlsForAccountResponse> listControlsForAccount =
        genForListControlsForAccount();

    private static HttpRequestDef<ListControlsForAccountRequest, ListControlsForAccountResponse> genForListControlsForAccount() {
        // basic
        HttpRequestDef.Builder<ListControlsForAccountRequest, ListControlsForAccountResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListControlsForAccountRequest.class, ListControlsForAccountResponse.class)
            .withName("ListControlsForAccount")
            .withUri("/v1/governance/managed-accounts/{managed_account_id}/controls")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsForAccountRequest::getManagedAccountId,
                ListControlsForAccountRequest::setManagedAccountId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListControlsForAccountRequest::getLimit, ListControlsForAccountRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsForAccountRequest::getMarker, ListControlsForAccountRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListControlsForOrganizationalUnitRequest, ListControlsForOrganizationalUnitResponse> listControlsForOrganizationalUnit =
        genForListControlsForOrganizationalUnit();

    private static HttpRequestDef<ListControlsForOrganizationalUnitRequest, ListControlsForOrganizationalUnitResponse> genForListControlsForOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<ListControlsForOrganizationalUnitRequest, ListControlsForOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListControlsForOrganizationalUnitRequest.class,
                    ListControlsForOrganizationalUnitResponse.class)
                .withName("ListControlsForOrganizationalUnit")
                .withUri("/v1/governance/managed-organizational-units/{managed_organizational_unit_id}/controls")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsForOrganizationalUnitRequest::getManagedOrganizationalUnitId,
                ListControlsForOrganizationalUnitRequest::setManagedOrganizationalUnitId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListControlsForOrganizationalUnitRequest::getLimit,
                ListControlsForOrganizationalUnitRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListControlsForOrganizationalUnitRequest::getMarker,
                ListControlsForOrganizationalUnitRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListDriftDetailsRequest, ListDriftDetailsResponse> listDriftDetails =
        genForListDriftDetails();

    private static HttpRequestDef<ListDriftDetailsRequest, ListDriftDetailsResponse> genForListDriftDetails() {
        // basic
        HttpRequestDef.Builder<ListDriftDetailsRequest, ListDriftDetailsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListDriftDetailsRequest.class, ListDriftDetailsResponse.class)
                .withName("ListDriftDetails")
                .withUri("/v1/governance/drift-details")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListEnabledControlsRequest, ListEnabledControlsResponse> listEnabledControls =
        genForListEnabledControls();

    private static HttpRequestDef<ListEnabledControlsRequest, ListEnabledControlsResponse> genForListEnabledControls() {
        // basic
        HttpRequestDef.Builder<ListEnabledControlsRequest, ListEnabledControlsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListEnabledControlsRequest.class, ListEnabledControlsResponse.class)
                .withName("ListEnabledControls")
                .withUri("/v1/governance/enabled-controls")
                .withContentType("application/json");

        // requests
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListEnabledControlsRequest::getLimit, ListEnabledControlsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListEnabledControlsRequest::getMarker, ListEnabledControlsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListExternalConfigRuleCompliancesRequest, ListExternalConfigRuleCompliancesResponse> listExternalConfigRuleCompliances =
        genForListExternalConfigRuleCompliances();

    private static HttpRequestDef<ListExternalConfigRuleCompliancesRequest, ListExternalConfigRuleCompliancesResponse> genForListExternalConfigRuleCompliances() {
        // basic
        HttpRequestDef.Builder<ListExternalConfigRuleCompliancesRequest, ListExternalConfigRuleCompliancesResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListExternalConfigRuleCompliancesRequest.class,
                    ListExternalConfigRuleCompliancesResponse.class)
                .withName("ListExternalConfigRuleCompliances")
                .withUri("/v1/governance/managed-accounts/{managed_account_id}/external-config-rule-compliances")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListExternalConfigRuleCompliancesRequest::getManagedAccountId,
                ListExternalConfigRuleCompliancesRequest::setManagedAccountId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComplianceStatusForAccountRequest, ShowComplianceStatusForAccountResponse> showComplianceStatusForAccount =
        genForShowComplianceStatusForAccount();

    private static HttpRequestDef<ShowComplianceStatusForAccountRequest, ShowComplianceStatusForAccountResponse> genForShowComplianceStatusForAccount() {
        // basic
        HttpRequestDef.Builder<ShowComplianceStatusForAccountRequest, ShowComplianceStatusForAccountResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowComplianceStatusForAccountRequest.class,
                    ShowComplianceStatusForAccountResponse.class)
                .withName("ShowComplianceStatusForAccount")
                .withUri("/v1/governance/managed-accounts/{managed_account_id}/compliance-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComplianceStatusForAccountRequest::getManagedAccountId,
                ShowComplianceStatusForAccountRequest::setManagedAccountId));
        builder.<String>withRequestField("control_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComplianceStatusForAccountRequest::getControlId,
                ShowComplianceStatusForAccountRequest::setControlId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowComplianceStatusForOrganizationalUnitRequest, ShowComplianceStatusForOrganizationalUnitResponse> showComplianceStatusForOrganizationalUnit =
        genForShowComplianceStatusForOrganizationalUnit();

    private static HttpRequestDef<ShowComplianceStatusForOrganizationalUnitRequest, ShowComplianceStatusForOrganizationalUnitResponse> genForShowComplianceStatusForOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<ShowComplianceStatusForOrganizationalUnitRequest, ShowComplianceStatusForOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowComplianceStatusForOrganizationalUnitRequest.class,
                    ShowComplianceStatusForOrganizationalUnitResponse.class)
                .withName("ShowComplianceStatusForOrganizationalUnit")
                .withUri(
                    "/v1/governance/managed-organizational-units/{managed_organizational_unit_id}/compliance-status")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComplianceStatusForOrganizationalUnitRequest::getManagedOrganizationalUnitId,
                ShowComplianceStatusForOrganizationalUnitRequest::setManagedOrganizationalUnitId));
        builder.<String>withRequestField("control_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowComplianceStatusForOrganizationalUnitRequest::getControlId,
                ShowComplianceStatusForOrganizationalUnitRequest::setControlId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowControlRequest, ShowControlResponse> showControl = genForShowControl();

    private static HttpRequestDef<ShowControlRequest, ShowControlResponse> genForShowControl() {
        // basic
        HttpRequestDef.Builder<ShowControlRequest, ShowControlResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowControlRequest.class, ShowControlResponse.class)
                .withName("ShowControl")
                .withUri("/v1/governance/controls/{control_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("control_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowControlRequest::getControlId, ShowControlRequest::setControlId));

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

    public static final HttpRequestDef<ShowControlsForAccountRequest, ShowControlsForAccountResponse> showControlsForAccount =
        genForShowControlsForAccount();

    private static HttpRequestDef<ShowControlsForAccountRequest, ShowControlsForAccountResponse> genForShowControlsForAccount() {
        // basic
        HttpRequestDef.Builder<ShowControlsForAccountRequest, ShowControlsForAccountResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowControlsForAccountRequest.class, ShowControlsForAccountResponse.class)
            .withName("ShowControlsForAccount")
            .withUri("/v1/governance/managed-accounts/{managed_account_id}/controls/{control_id}")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowControlsForAccountRequest::getManagedAccountId,
                ShowControlsForAccountRequest::setManagedAccountId));
        builder.<String>withRequestField("control_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowControlsForAccountRequest::getControlId,
                ShowControlsForAccountRequest::setControlId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowControlsForOrganizationalUnitRequest, ShowControlsForOrganizationalUnitResponse> showControlsForOrganizationalUnit =
        genForShowControlsForOrganizationalUnit();

    private static HttpRequestDef<ShowControlsForOrganizationalUnitRequest, ShowControlsForOrganizationalUnitResponse> genForShowControlsForOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<ShowControlsForOrganizationalUnitRequest, ShowControlsForOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowControlsForOrganizationalUnitRequest.class,
                    ShowControlsForOrganizationalUnitResponse.class)
                .withName("ShowControlsForOrganizationalUnit")
                .withUri(
                    "/v1/governance/managed-organizational-units/{managed_organizational_unit_id}/controls/{control_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowControlsForOrganizationalUnitRequest::getManagedOrganizationalUnitId,
                ShowControlsForOrganizationalUnitRequest::setManagedOrganizationalUnitId));
        builder.<String>withRequestField("control_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowControlsForOrganizationalUnitRequest::getControlId,
                ShowControlsForOrganizationalUnitRequest::setControlId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CheckLaunchRequest, CheckLaunchResponse> checkLaunch = genForCheckLaunch();

    private static HttpRequestDef<CheckLaunchRequest, CheckLaunchResponse> genForCheckLaunch() {
        // basic
        HttpRequestDef.Builder<CheckLaunchRequest, CheckLaunchResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CheckLaunchRequest.class, CheckLaunchResponse.class)
                .withName("CheckLaunch")
                .withUri("/v1/landing-zone/pre-launch-check")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteLandingZoneRequest, DeleteLandingZoneResponse> deleteLandingZone =
        genForDeleteLandingZone();

    private static HttpRequestDef<DeleteLandingZoneRequest, DeleteLandingZoneResponse> genForDeleteLandingZone() {
        // basic
        HttpRequestDef.Builder<DeleteLandingZoneRequest, DeleteLandingZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, DeleteLandingZoneRequest.class, DeleteLandingZoneResponse.class)
                .withName("DeleteLandingZone")
                .withUri("/v1/landing-zone/delete")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<SetupLandingZoneRequest, SetupLandingZoneResponse> setupLandingZone =
        genForSetupLandingZone();

    private static HttpRequestDef<SetupLandingZoneRequest, SetupLandingZoneResponse> genForSetupLandingZone() {
        // basic
        HttpRequestDef.Builder<SetupLandingZoneRequest, SetupLandingZoneResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, SetupLandingZoneRequest.class, SetupLandingZoneResponse.class)
                .withName("SetupLandingZone")
                .withUri("/v1/landing-zone/setup")
                .withContentType("application/json");

        // requests
        builder.<SetupLandingZoneReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(SetupLandingZoneReqBody.class),
            f -> f.withMarshaller(SetupLandingZoneRequest::getBody, SetupLandingZoneRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowAvailableUpdatesRequest, ShowAvailableUpdatesResponse> showAvailableUpdates =
        genForShowAvailableUpdates();

    private static HttpRequestDef<ShowAvailableUpdatesRequest, ShowAvailableUpdatesResponse> genForShowAvailableUpdates() {
        // basic
        HttpRequestDef.Builder<ShowAvailableUpdatesRequest, ShowAvailableUpdatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowAvailableUpdatesRequest.class, ShowAvailableUpdatesResponse.class)
            .withName("ShowAvailableUpdates")
            .withUri("/v1/landing-zone/available-updates")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowHomeRegionRequest, ShowHomeRegionResponse> showHomeRegion =
        genForShowHomeRegion();

    private static HttpRequestDef<ShowHomeRegionRequest, ShowHomeRegionResponse> genForShowHomeRegion() {
        // basic
        HttpRequestDef.Builder<ShowHomeRegionRequest, ShowHomeRegionResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowHomeRegionRequest.class, ShowHomeRegionResponse.class)
                .withName("ShowHomeRegion")
                .withUri("/v1/landing-zone/home-region")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLandingZoneConfigurationRequest, ShowLandingZoneConfigurationResponse> showLandingZoneConfiguration =
        genForShowLandingZoneConfiguration();

    private static HttpRequestDef<ShowLandingZoneConfigurationRequest, ShowLandingZoneConfigurationResponse> genForShowLandingZoneConfiguration() {
        // basic
        HttpRequestDef.Builder<ShowLandingZoneConfigurationRequest, ShowLandingZoneConfigurationResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLandingZoneConfigurationRequest.class,
                    ShowLandingZoneConfigurationResponse.class)
                .withName("ShowLandingZoneConfiguration")
                .withUri("/v1/landing-zone/configuration")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLandingZoneIdentityCenterRequest, ShowLandingZoneIdentityCenterResponse> showLandingZoneIdentityCenter =
        genForShowLandingZoneIdentityCenter();

    private static HttpRequestDef<ShowLandingZoneIdentityCenterRequest, ShowLandingZoneIdentityCenterResponse> genForShowLandingZoneIdentityCenter() {
        // basic
        HttpRequestDef.Builder<ShowLandingZoneIdentityCenterRequest, ShowLandingZoneIdentityCenterResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowLandingZoneIdentityCenterRequest.class,
                    ShowLandingZoneIdentityCenterResponse.class)
                .withName("ShowLandingZoneIdentityCenter")
                .withUri("/v1/landing-zone/identity-center")
                .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowLandingZoneStatusRequest, ShowLandingZoneStatusResponse> showLandingZoneStatus =
        genForShowLandingZoneStatus();

    private static HttpRequestDef<ShowLandingZoneStatusRequest, ShowLandingZoneStatusResponse> genForShowLandingZoneStatus() {
        // basic
        HttpRequestDef.Builder<ShowLandingZoneStatusRequest, ShowLandingZoneStatusResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowLandingZoneStatusRequest.class, ShowLandingZoneStatusResponse.class)
            .withName("ShowLandingZoneStatus")
            .withUri("/v1/landing-zone/status")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateAccountRequest, CreateAccountResponse> createAccount =
        genForCreateAccount();

    private static HttpRequestDef<CreateAccountRequest, CreateAccountResponse> genForCreateAccount() {
        // basic
        HttpRequestDef.Builder<CreateAccountRequest, CreateAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateAccountRequest.class, CreateAccountResponse.class)
                .withName("CreateAccount")
                .withUri("/v1/managed-organization/managed-accounts")
                .withContentType("application/json");

        // requests
        builder.<CreateManagedAccountRequest>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateManagedAccountRequest.class),
            f -> f.withMarshaller(CreateAccountRequest::getBody, CreateAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateManagedOrganizationalUnitRequest, CreateManagedOrganizationalUnitResponse> createManagedOrganizationalUnit =
        genForCreateManagedOrganizationalUnit();

    private static HttpRequestDef<CreateManagedOrganizationalUnitRequest, CreateManagedOrganizationalUnitResponse> genForCreateManagedOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<CreateManagedOrganizationalUnitRequest, CreateManagedOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    CreateManagedOrganizationalUnitRequest.class,
                    CreateManagedOrganizationalUnitResponse.class)
                .withName("CreateManagedOrganizationalUnit")
                .withUri("/v1/managed-organization/managed-organizational-units")
                .withContentType("application/json");

        // requests
        builder.<CreateOrganizationalUnitReqBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateOrganizationalUnitReqBody.class),
            f -> f.withMarshaller(CreateManagedOrganizationalUnitRequest::getBody,
                CreateManagedOrganizationalUnitRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteManagedOrganizationalUnitsRequest, DeleteManagedOrganizationalUnitsResponse> deleteManagedOrganizationalUnits =
        genForDeleteManagedOrganizationalUnits();

    private static HttpRequestDef<DeleteManagedOrganizationalUnitsRequest, DeleteManagedOrganizationalUnitsResponse> genForDeleteManagedOrganizationalUnits() {
        // basic
        HttpRequestDef.Builder<DeleteManagedOrganizationalUnitsRequest, DeleteManagedOrganizationalUnitsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.DELETE,
                    DeleteManagedOrganizationalUnitsRequest.class,
                    DeleteManagedOrganizationalUnitsResponse.class)
                .withName("DeleteManagedOrganizationalUnits")
                .withUri("/v1/managed-organization/managed-organizational-units/{managed_organizational_unit_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteManagedOrganizationalUnitsRequest::getManagedOrganizationalUnitId,
                DeleteManagedOrganizationalUnitsRequest::setManagedOrganizationalUnitId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeregisterOrganizationalUnitRequest, DeregisterOrganizationalUnitResponse> deregisterOrganizationalUnit =
        genForDeregisterOrganizationalUnit();

    private static HttpRequestDef<DeregisterOrganizationalUnitRequest, DeregisterOrganizationalUnitResponse> genForDeregisterOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<DeregisterOrganizationalUnitRequest, DeregisterOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    DeregisterOrganizationalUnitRequest.class,
                    DeregisterOrganizationalUnitResponse.class)
                .withName("DeregisterOrganizationalUnit")
                .withUri(
                    "/v1/managed-organization/managed-organizational-units/{managed_organizational_unit_id}/de-register")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeregisterOrganizationalUnitRequest::getManagedOrganizationalUnitId,
                DeregisterOrganizationalUnitRequest::setManagedOrganizationalUnitId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<EnrollAccountRequest, EnrollAccountResponse> enrollAccount =
        genForEnrollAccount();

    private static HttpRequestDef<EnrollAccountRequest, EnrollAccountResponse> genForEnrollAccount() {
        // basic
        HttpRequestDef.Builder<EnrollAccountRequest, EnrollAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, EnrollAccountRequest.class, EnrollAccountResponse.class)
                .withName("EnrollAccount")
                .withUri("/v1/managed-organization/accounts/{managed_account_id}/enroll")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(EnrollAccountRequest::getManagedAccountId,
                EnrollAccountRequest::setManagedAccountId));
        builder.<EnrollAccountRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(EnrollAccountRequestBody.class),
            f -> f.withMarshaller(EnrollAccountRequest::getBody, EnrollAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListManagedAccountsRequest, ListManagedAccountsResponse> listManagedAccounts =
        genForListManagedAccounts();

    private static HttpRequestDef<ListManagedAccountsRequest, ListManagedAccountsResponse> genForListManagedAccounts() {
        // basic
        HttpRequestDef.Builder<ListManagedAccountsRequest, ListManagedAccountsResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListManagedAccountsRequest.class, ListManagedAccountsResponse.class)
                .withName("ListManagedAccounts")
                .withUri("/v1/managed-organization/managed-accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("control_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedAccountsRequest::getControlId, ListManagedAccountsRequest::setControlId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagedAccountsRequest::getLimit, ListManagedAccountsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedAccountsRequest::getMarker, ListManagedAccountsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListManagedAccountsForParentRequest, ListManagedAccountsForParentResponse> listManagedAccountsForParent =
        genForListManagedAccountsForParent();

    private static HttpRequestDef<ListManagedAccountsForParentRequest, ListManagedAccountsForParentResponse> genForListManagedAccountsForParent() {
        // basic
        HttpRequestDef.Builder<ListManagedAccountsForParentRequest, ListManagedAccountsForParentResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListManagedAccountsForParentRequest.class,
                    ListManagedAccountsForParentResponse.class)
                .withName("ListManagedAccountsForParent")
                .withUri(
                    "/v1/managed-organization/managed-organizational-units/{managed_organizational_unit_id}/managed-accounts")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedAccountsForParentRequest::getManagedOrganizationalUnitId,
                ListManagedAccountsForParentRequest::setManagedOrganizationalUnitId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagedAccountsForParentRequest::getLimit,
                ListManagedAccountsForParentRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedAccountsForParentRequest::getMarker,
                ListManagedAccountsForParentRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListManagedOrganizationalUnitsRequest, ListManagedOrganizationalUnitsResponse> listManagedOrganizationalUnits =
        genForListManagedOrganizationalUnits();

    private static HttpRequestDef<ListManagedOrganizationalUnitsRequest, ListManagedOrganizationalUnitsResponse> genForListManagedOrganizationalUnits() {
        // basic
        HttpRequestDef.Builder<ListManagedOrganizationalUnitsRequest, ListManagedOrganizationalUnitsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ListManagedOrganizationalUnitsRequest.class,
                    ListManagedOrganizationalUnitsResponse.class)
                .withName("ListManagedOrganizationalUnits")
                .withUri("/v1/managed-organization/managed-organizational-units")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("control_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedOrganizationalUnitsRequest::getControlId,
                ListManagedOrganizationalUnitsRequest::setControlId));
        builder.<Integer>withRequestField("limit",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(Integer.class),
            f -> f.withMarshaller(ListManagedOrganizationalUnitsRequest::getLimit,
                ListManagedOrganizationalUnitsRequest::setLimit));
        builder.<String>withRequestField("marker",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListManagedOrganizationalUnitsRequest::getMarker,
                ListManagedOrganizationalUnitsRequest::setMarker));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListOperationRequest, ListOperationResponse> listOperation =
        genForListOperation();

    private static HttpRequestDef<ListOperationRequest, ListOperationResponse> genForListOperation() {
        // basic
        HttpRequestDef.Builder<ListOperationRequest, ListOperationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ListOperationRequest.class, ListOperationResponse.class)
                .withName("ListOperation")
                .withUri("/v1/managed-organization")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("account_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOperationRequest::getAccountId, ListOperationRequest::setAccountId));
        builder.<String>withRequestField("organizational_unit_id",
            LocationType.Query,
            FieldExistence.NULL_IGNORE,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ListOperationRequest::getOrganizationalUnitId,
                ListOperationRequest::setOrganizationalUnitId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ReRegisterOrganizationalUnitRequest, ReRegisterOrganizationalUnitResponse> reRegisterOrganizationalUnit =
        genForReRegisterOrganizationalUnit();

    private static HttpRequestDef<ReRegisterOrganizationalUnitRequest, ReRegisterOrganizationalUnitResponse> genForReRegisterOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<ReRegisterOrganizationalUnitRequest, ReRegisterOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    ReRegisterOrganizationalUnitRequest.class,
                    ReRegisterOrganizationalUnitResponse.class)
                .withName("ReRegisterOrganizationalUnit")
                .withUri("/v1/managed-organization/organizational-units/{organizational_unit_id}/re-register")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ReRegisterOrganizationalUnitRequest::getOrganizationalUnitId,
                ReRegisterOrganizationalUnitRequest::setOrganizationalUnitId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<RegisterOrganizationalUnitRequest, RegisterOrganizationalUnitResponse> registerOrganizationalUnit =
        genForRegisterOrganizationalUnit();

    private static HttpRequestDef<RegisterOrganizationalUnitRequest, RegisterOrganizationalUnitResponse> genForRegisterOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<RegisterOrganizationalUnitRequest, RegisterOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.POST,
                    RegisterOrganizationalUnitRequest.class,
                    RegisterOrganizationalUnitResponse.class)
                .withName("RegisterOrganizationalUnit")
                .withUri("/v1/managed-organization/organizational-units/{organizational_unit_id}/register")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(RegisterOrganizationalUnitRequest::getOrganizationalUnitId,
                RegisterOrganizationalUnitRequest::setOrganizationalUnitId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowManagedAccountRequest, ShowManagedAccountResponse> showManagedAccount =
        genForShowManagedAccount();

    private static HttpRequestDef<ShowManagedAccountRequest, ShowManagedAccountResponse> genForShowManagedAccount() {
        // basic
        HttpRequestDef.Builder<ShowManagedAccountRequest, ShowManagedAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowManagedAccountRequest.class, ShowManagedAccountResponse.class)
                .withName("ShowManagedAccount")
                .withUri("/v1/managed-organization/managed-accounts/{managed_account_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowManagedAccountRequest::getManagedAccountId,
                ShowManagedAccountRequest::setManagedAccountId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowManagedAccountTemplateRequest, ShowManagedAccountTemplateResponse> showManagedAccountTemplate =
        genForShowManagedAccountTemplate();

    private static HttpRequestDef<ShowManagedAccountTemplateRequest, ShowManagedAccountTemplateResponse> genForShowManagedAccountTemplate() {
        // basic
        HttpRequestDef.Builder<ShowManagedAccountTemplateRequest, ShowManagedAccountTemplateResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowManagedAccountTemplateRequest.class,
                    ShowManagedAccountTemplateResponse.class)
                .withName("ShowManagedAccountTemplate")
                .withUri("/v1/managed-organization/managed-accounts/{managed_account_id}/blueprint")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowManagedAccountTemplateRequest::getManagedAccountId,
                ShowManagedAccountTemplateRequest::setManagedAccountId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowManagedCoreAccountRequest, ShowManagedCoreAccountResponse> showManagedCoreAccount =
        genForShowManagedCoreAccount();

    private static HttpRequestDef<ShowManagedCoreAccountRequest, ShowManagedCoreAccountResponse> genForShowManagedCoreAccount() {
        // basic
        HttpRequestDef.Builder<ShowManagedCoreAccountRequest, ShowManagedCoreAccountResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ShowManagedCoreAccountRequest.class, ShowManagedCoreAccountResponse.class)
            .withName("ShowManagedCoreAccount")
            .withUri("/v1/managed-organization/managed-core-accounts")
            .withContentType("application/json");

        // requests
        builder.<ShowManagedCoreAccountRequest.AccountTypeEnum>withRequestField("account_type",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(ShowManagedCoreAccountRequest.AccountTypeEnum.class),
            f -> f.withMarshaller(ShowManagedCoreAccountRequest::getAccountType,
                ShowManagedCoreAccountRequest::setAccountType));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowManagedOrganizationalUnitRequest, ShowManagedOrganizationalUnitResponse> showManagedOrganizationalUnit =
        genForShowManagedOrganizationalUnit();

    private static HttpRequestDef<ShowManagedOrganizationalUnitRequest, ShowManagedOrganizationalUnitResponse> genForShowManagedOrganizationalUnit() {
        // basic
        HttpRequestDef.Builder<ShowManagedOrganizationalUnitRequest, ShowManagedOrganizationalUnitResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET,
                    ShowManagedOrganizationalUnitRequest.class,
                    ShowManagedOrganizationalUnitResponse.class)
                .withName("ShowManagedOrganizationalUnit")
                .withUri("/v1/managed-organization/managed-organizational-units/{managed_organizational_unit_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_organizational_unit_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowManagedOrganizationalUnitRequest::getManagedOrganizationalUnitId,
                ShowManagedOrganizationalUnitRequest::setManagedOrganizationalUnitId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowOperationRequest, ShowOperationResponse> showOperation =
        genForShowOperation();

    private static HttpRequestDef<ShowOperationRequest, ShowOperationResponse> genForShowOperation() {
        // basic
        HttpRequestDef.Builder<ShowOperationRequest, ShowOperationResponse> builder =
            HttpRequestDef.builder(HttpMethod.GET, ShowOperationRequest.class, ShowOperationResponse.class)
                .withName("ShowOperation")
                .withUri("/v1/managed-organization/{operation_id}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("operation_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowOperationRequest::getOperationId, ShowOperationRequest::setOperationId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UnEnrollAccountRequest, UnEnrollAccountResponse> unEnrollAccount =
        genForUnEnrollAccount();

    private static HttpRequestDef<UnEnrollAccountRequest, UnEnrollAccountResponse> genForUnEnrollAccount() {
        // basic
        HttpRequestDef.Builder<UnEnrollAccountRequest, UnEnrollAccountResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, UnEnrollAccountRequest.class, UnEnrollAccountResponse.class)
                .withName("UnEnrollAccount")
                .withUri("/v1/managed-organization/managed-accounts/{managed_account_id}/un-enroll")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UnEnrollAccountRequest::getManagedAccountId,
                UnEnrollAccountRequest::setManagedAccountId));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<UpdateManagedAccountRequest, UpdateManagedAccountResponse> updateManagedAccount =
        genForUpdateManagedAccount();

    private static HttpRequestDef<UpdateManagedAccountRequest, UpdateManagedAccountResponse> genForUpdateManagedAccount() {
        // basic
        HttpRequestDef.Builder<UpdateManagedAccountRequest, UpdateManagedAccountResponse> builder = HttpRequestDef
            .builder(HttpMethod.POST, UpdateManagedAccountRequest.class, UpdateManagedAccountResponse.class)
            .withName("UpdateManagedAccount")
            .withUri("/v1/managed-organization/managed-accounts/{managed_account_id}/update")
            .withContentType("application/json");

        // requests
        builder.<String>withRequestField("managed_account_id",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(UpdateManagedAccountRequest::getManagedAccountId,
                UpdateManagedAccountRequest::setManagedAccountId));
        builder.<UpdateManagedAccountRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(UpdateManagedAccountRequestBody.class),
            f -> f.withMarshaller(UpdateManagedAccountRequest::getBody, UpdateManagedAccountRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> createTemplate =
        genForCreateTemplate();

    private static HttpRequestDef<CreateTemplateRequest, CreateTemplateResponse> genForCreateTemplate() {
        // basic
        HttpRequestDef.Builder<CreateTemplateRequest, CreateTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.POST, CreateTemplateRequest.class, CreateTemplateResponse.class)
                .withName("CreateTemplate")
                .withUri("/v1/rgc/templates")
                .withContentType("application/json");

        // requests
        builder.<CreateTemplateRequestBody>withRequestField("body",
            LocationType.Body,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(CreateTemplateRequestBody.class),
            f -> f.withMarshaller(CreateTemplateRequest::getBody, CreateTemplateRequest::setBody));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> deleteTemplate =
        genForDeleteTemplate();

    private static HttpRequestDef<DeleteTemplateRequest, DeleteTemplateResponse> genForDeleteTemplate() {
        // basic
        HttpRequestDef.Builder<DeleteTemplateRequest, DeleteTemplateResponse> builder =
            HttpRequestDef.builder(HttpMethod.DELETE, DeleteTemplateRequest.class, DeleteTemplateResponse.class)
                .withName("DeleteTemplate")
                .withUri("/v1/rgc/templates/{template_name}")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(DeleteTemplateRequest::getTemplateName, DeleteTemplateRequest::setTemplateName));

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ListPredefinedTemplatesRequest, ListPredefinedTemplatesResponse> listPredefinedTemplates =
        genForListPredefinedTemplates();

    private static HttpRequestDef<ListPredefinedTemplatesRequest, ListPredefinedTemplatesResponse> genForListPredefinedTemplates() {
        // basic
        HttpRequestDef.Builder<ListPredefinedTemplatesRequest, ListPredefinedTemplatesResponse> builder = HttpRequestDef
            .builder(HttpMethod.GET, ListPredefinedTemplatesRequest.class, ListPredefinedTemplatesResponse.class)
            .withName("ListPredefinedTemplates")
            .withUri("/v1/rgc/predefined-templates")
            .withContentType("application/json");

        // requests

        // response

        return builder.build();
    }

    public static final HttpRequestDef<ShowTemplateDeployParamsRequest, ShowTemplateDeployParamsResponse> showTemplateDeployParams =
        genForShowTemplateDeployParams();

    private static HttpRequestDef<ShowTemplateDeployParamsRequest, ShowTemplateDeployParamsResponse> genForShowTemplateDeployParams() {
        // basic
        HttpRequestDef.Builder<ShowTemplateDeployParamsRequest, ShowTemplateDeployParamsResponse> builder =
            HttpRequestDef
                .builder(HttpMethod.GET, ShowTemplateDeployParamsRequest.class, ShowTemplateDeployParamsResponse.class)
                .withName("ShowTemplateDeployParams")
                .withUri("/v1/rgc/templates/{template_name}/deploy-params")
                .withContentType("application/json");

        // requests
        builder.<String>withRequestField("template_name",
            LocationType.Path,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateDeployParamsRequest::getTemplateName,
                ShowTemplateDeployParamsRequest::setTemplateName));
        builder.<String>withRequestField("version",
            LocationType.Query,
            FieldExistence.NON_NULL_NON_EMPTY,
            TypeCasts.uncheckedConversion(String.class),
            f -> f.withMarshaller(ShowTemplateDeployParamsRequest::getVersion,
                ShowTemplateDeployParamsRequest::setVersion));

        // response

        return builder.build();
    }

}
