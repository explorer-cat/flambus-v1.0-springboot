package flambus.app.service;


import flambus.app.dto.member.JoinRequestDto;
import flambus.app.dto.member.MemberDto;
import flambus.app.dto.member.TokenDto;
import flambus.app.dto.store.StoreDto;
import flambus.app.dto.store.StoreJounalDto;
import flambus.app.dto.store.StoreMapMarkerDto;
import flambus.app.entity.Member;
import flambus.app.entity.Store;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MemberService {

    TokenDto login(String email, String password);
    TokenDto createToken(Long memberIdx);
    boolean join(JoinRequestDto request);

    Member getMember(String email);

    Member getMember(long memberIdx);

    List<MemberDto> getAllMembers();

    boolean isAdmin(long memberIdx);

    long addAcorns(long memberIdx,int count);

    long removeAcorns(long memberIdx,int count);

}
