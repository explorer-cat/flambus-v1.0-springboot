package flambus.app._enum;

public enum CustomExceptionCode {
    EXPIRED_JWT("EXPIRED_JWT","만료된 토큰입니다."),
    INVALID_JWT("INVALID_JWT", "올바른 형식의 토큰이 아닙니다."),
    NOT_FOUND_EMAIL("NOT_FOUND_EMAIL", "이메일을 찾을 수 없습니다."),
    NOT_FOUND("NOT_FOUND","해당 정보를 찾을 수 없습니다."),
    DUPLICATED("DUPLICATED","중복된 정보가 존재합니다."),
    SERVER_ERROR("SERVER_ERROR","요청중 서버 문제가 발생했습니다."),
    ACCESS_DENIED("ACCESS_DENIED", "요청이 거부 되었습니다.");
    // 추후에 추가될 다른 업로드 타입들

    private final String statusCode;
    private final String statusMessage;

    CustomExceptionCode(String statusCode, String statusMessage) {
        this.statusCode = statusCode;
        this.statusMessage = statusMessage;
    }
    public String getStatusCode() {
        return statusCode;
    }
    public String getStatusMessage() {
        return statusMessage;
    }

}
