package hellojpa;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
public class Member {

    @Id @GeneratedValue
    private Long id;

    @Column(name = "username")
    private String username;

    @ManyToOne // 연관관계 주인
    @JoinColumn(name = "TEAM_ID")
    private Team team;
}
