package se331.lab.util;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import se331.lab.entity.Event;
import se331.lab.entity.EventDTO;
import se331.lab.entity.EventOrganizerDTO;
import se331.lab.entity.Organizer;
import se331.lab.entity.OrganizerDTO;
import se331.lab.entity.OrganizerOwnEventsDTO;
import se331.lab.entity.Participant;
import se331.lab.entity.ParticipantDTO;
import se331.lab.entity.ParticipantEventHistoryDTO;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-03T02:41:18+0700",
    comments = "version: 1.6.0, compiler: javac, environment: Java 20.0.1 (Oracle Corporation)"
)
public class LabMapperImpl implements LabMapper {

    @Override
    public EventDTO getEventDto(Event event) {
        if ( event == null ) {
            return null;
        }

        EventDTO.EventDTOBuilder eventDTO = EventDTO.builder();

        eventDTO.id( event.getId() );
        eventDTO.category( event.getCategory() );
        eventDTO.title( event.getTitle() );
        eventDTO.description( event.getDescription() );
        eventDTO.location( event.getLocation() );
        eventDTO.date( event.getDate() );
        eventDTO.time( event.getTime() );
        eventDTO.petAllowed( event.getPetAllowed() );
        eventDTO.organizer( organizerToEventOrganizerDTO( event.getOrganizer() ) );
        eventDTO.participants( participantListToParticipantDTOArray( event.getParticipants() ) );

        return eventDTO.build();
    }

    @Override
    public List<EventDTO> getEventDto(List<Event> events) {
        if ( events == null ) {
            return null;
        }

        List<EventDTO> list = new ArrayList<EventDTO>( events.size() );
        for ( Event event : events ) {
            list.add( getEventDto( event ) );
        }

        return list;
    }

    @Override
    public OrganizerDTO getOrganizerDTO(Organizer organizer) {
        if ( organizer == null ) {
            return null;
        }

        OrganizerDTO.OrganizerDTOBuilder organizerDTO = OrganizerDTO.builder();

        organizerDTO.id( organizer.getId() );
        organizerDTO.name( organizer.getName() );
        organizerDTO.ownEvents( eventListToOrganizerOwnEventsDTOList( organizer.getOwnEvents() ) );

        return organizerDTO.build();
    }

    @Override
    public List<OrganizerDTO> getOrganizerDTO(List<Organizer> organizers) {
        if ( organizers == null ) {
            return null;
        }

        List<OrganizerDTO> list = new ArrayList<OrganizerDTO>( organizers.size() );
        for ( Organizer organizer : organizers ) {
            list.add( getOrganizerDTO( organizer ) );
        }

        return list;
    }

    @Override
    public ParticipantDTO getParticipantDTO(Participant participant) {
        if ( participant == null ) {
            return null;
        }

        ParticipantDTO.ParticipantDTOBuilder participantDTO = ParticipantDTO.builder();

        participantDTO.eventHistories( eventListToParticipantEventHistoryDTOList( participant.getEventHistory() ) );
        participantDTO.id( participant.getId() );
        participantDTO.name( participant.getName() );
        participantDTO.telNo( participant.getTelNo() );

        return participantDTO.build();
    }

    @Override
    public List<ParticipantDTO> getParticipantDTO(List<Participant> participants) {
        if ( participants == null ) {
            return null;
        }

        List<ParticipantDTO> list = new ArrayList<ParticipantDTO>( participants.size() );
        for ( Participant participant : participants ) {
            list.add( getParticipantDTO( participant ) );
        }

        return list;
    }

    protected EventOrganizerDTO organizerToEventOrganizerDTO(Organizer organizer) {
        if ( organizer == null ) {
            return null;
        }

        EventOrganizerDTO.EventOrganizerDTOBuilder eventOrganizerDTO = EventOrganizerDTO.builder();

        eventOrganizerDTO.id( organizer.getId() );
        eventOrganizerDTO.name( organizer.getName() );

        return eventOrganizerDTO.build();
    }

    protected ParticipantDTO[] participantListToParticipantDTOArray(List<Participant> list) {
        if ( list == null ) {
            return null;
        }

        ParticipantDTO[] participantDTOTmp = new ParticipantDTO[list.size()];
        int i = 0;
        for ( Participant participant : list ) {
            participantDTOTmp[i] = getParticipantDTO( participant );
            i++;
        }

        return participantDTOTmp;
    }

    protected OrganizerOwnEventsDTO eventToOrganizerOwnEventsDTO(Event event) {
        if ( event == null ) {
            return null;
        }

        OrganizerOwnEventsDTO.OrganizerOwnEventsDTOBuilder organizerOwnEventsDTO = OrganizerOwnEventsDTO.builder();

        organizerOwnEventsDTO.id( event.getId() );
        organizerOwnEventsDTO.category( event.getCategory() );
        organizerOwnEventsDTO.title( event.getTitle() );
        organizerOwnEventsDTO.description( event.getDescription() );
        organizerOwnEventsDTO.location( event.getLocation() );
        organizerOwnEventsDTO.date( event.getDate() );
        organizerOwnEventsDTO.time( event.getTime() );
        organizerOwnEventsDTO.petAllowed( event.getPetAllowed() );
        List<Participant> list = event.getParticipants();
        if ( list != null ) {
            organizerOwnEventsDTO.participants( new ArrayList<Participant>( list ) );
        }

        return organizerOwnEventsDTO.build();
    }

    protected List<OrganizerOwnEventsDTO> eventListToOrganizerOwnEventsDTOList(List<Event> list) {
        if ( list == null ) {
            return null;
        }

        List<OrganizerOwnEventsDTO> list1 = new ArrayList<OrganizerOwnEventsDTO>( list.size() );
        for ( Event event : list ) {
            list1.add( eventToOrganizerOwnEventsDTO( event ) );
        }

        return list1;
    }

    protected ParticipantEventHistoryDTO eventToParticipantEventHistoryDTO(Event event) {
        if ( event == null ) {
            return null;
        }

        ParticipantEventHistoryDTO.ParticipantEventHistoryDTOBuilder participantEventHistoryDTO = ParticipantEventHistoryDTO.builder();

        participantEventHistoryDTO.id( event.getId() );
        participantEventHistoryDTO.category( event.getCategory() );
        participantEventHistoryDTO.title( event.getTitle() );
        participantEventHistoryDTO.description( event.getDescription() );
        participantEventHistoryDTO.location( event.getLocation() );
        participantEventHistoryDTO.date( event.getDate() );
        participantEventHistoryDTO.time( event.getTime() );
        participantEventHistoryDTO.petAllowed( event.getPetAllowed() );
        participantEventHistoryDTO.organizer( organizerToEventOrganizerDTO( event.getOrganizer() ) );

        return participantEventHistoryDTO.build();
    }

    protected List<ParticipantEventHistoryDTO> eventListToParticipantEventHistoryDTOList(List<Event> list) {
        if ( list == null ) {
            return null;
        }

        List<ParticipantEventHistoryDTO> list1 = new ArrayList<ParticipantEventHistoryDTO>( list.size() );
        for ( Event event : list ) {
            list1.add( eventToParticipantEventHistoryDTO( event ) );
        }

        return list1;
    }
}
