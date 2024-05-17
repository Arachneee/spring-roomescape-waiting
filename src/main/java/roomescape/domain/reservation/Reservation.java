package roomescape.domain.reservation;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import java.time.LocalDate;
import java.util.Objects;
import roomescape.domain.member.Member;

@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"date", "time_id", "theme_id"})})
public class Reservation {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    private Member member;
    private LocalDate date;
    @ManyToOne(fetch = FetchType.LAZY)
    private ReservationTime time;
    @ManyToOne(fetch = FetchType.LAZY)
    private Theme theme;

    public Reservation(Member member, LocalDate date, ReservationTime time, Theme theme) {
        this.member = member;
        this.date = date;
        this.time = time;
        this.theme = theme;
    }

    protected Reservation() {
    }

    public Long getId() {
        return id;
    }

    public Member getMember() {
        return member;
    }

    public LocalDate getDate() {
        return date;
    }

    public ReservationTime getTime() {
        return time;
    }

    public Theme getTheme() {
        return theme;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Reservation that = (Reservation) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
